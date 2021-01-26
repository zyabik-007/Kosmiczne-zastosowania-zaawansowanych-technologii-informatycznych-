

import scala.xml.XML
import java.awt.geom.Path2D
import org.apache.hadoop.fs.{FileSystem, Path}
import java.net.URI
import java.io.{DataInputStream, EOFException, InputStreamReader}
import org.apache.spark.SparkContext
import java.io.BufferedInputStream
import java.io.DataInputStream
import java.io.File
import java.io.FileInputStream
import java.io.FileNotFoundException
import java.io.IOException
import java.awt.Graphics
import java.awt.Image
import java.awt.image.BufferedImage
//import javax.media.jai._
import javax.imageio.ImageIO;
import java.awt.Color
import java.io.ByteArrayOutputStream
import org.apache.hadoop.conf.Configuration
import org.apache.spark.SparkConf
import java.io.BufferedOutputStream
import java.io.ByteArrayInputStream
import java.io.InputStream
import org.apache.hadoop.fs.FSDataOutputStream
import org.apache.hadoop.fs.FSDataInputStream

def filter_bounding_box(positionsString: String, lat_test: Double, lon_test: Double, lat2: Double, lon2: Double, lat3: Double, lon3: Double, lat4: Double, lon4: Double): Boolean = {
  val positions: Array[Double] = positionsString.split(" ").map(_.toDouble) //"122.00 2334.000"
  val product_area: Path2D = new Path2D.Double();
  product_area.moveTo(positions(0), positions(1));
  for (Array(lat, lon) <- positions.grouped(2).drop(1)) product_area.lineTo(lat, lon)
  product_area.contains(lat_test, lon_test)
  product_area.contains(lat2, lon2)
  product_area.contains(lat3, lon3)
  product_area.contains(lat4, lon4)
}

//var sentinel_metadata = sc.wholeTextFiles ("swift2d://products.sentinel/sentinel2/baltic/../*MSIL2A.xml",128)
var sentinel_metadata = sc.wholeTextFiles("swift2d://sentinel_gda.sentinel/sentinel2/baltic/../*MSIL2A.xml", 128)

var xml = sentinel_metadata.map {
  case (file_name, content) =>
    (file_name, XML.loadString(content))
}

var details = xml.map {
  case (file_name, xml_nodes) =>
    (file_name, xml_nodes \\ "EXT_POS_LIST" text,
      xml_nodes \\ "Cloud_Coverage_Assessment" text)
}

var filtered = details.filter {
  case (file_name, bounding_box, cloud_percentage) =>
    (
      cloud_percentage.toFloat >= 20 &&
        cloud_percentage.toFloat < 100 &&
        filter_bounding_box(bounding_box, 54.443602, 18.552468, 54.452688, 18.565360, 54.440056, 18.577546, 54.432358, 18.562963) //sopot
      )

}

var products = filtered.map {
  case (file_name, bounding_box, cloud_percentage) =>
    (
      file_name.substring(0, file_name.lastIndexOf('/')),
      cloud_percentage

    )
}

products.collect.foreach(println)
println("Found products =" + products.count)
