# Kosmiczne-zastosowania-zaawansowanych-technologii-informatycznych
# Результат выполнения программы в zeppelin Wynik działania program w zeppelin

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
import javax.imageio.ImageIO
import java.awt.Color
import java.io.ByteArrayOutputStream
import org.apache.hadoop.conf.Configuration
import org.apache.spark.SparkConf
import java.io.BufferedOutputStream
import java.io.ByteArrayInputStream
import java.io.InputStream
import org.apache.hadoop.fs.FSDataOutputStream
import org.apache.hadoop.fs.FSDataInputStream
filter_bounding_box: (positionsString: String, lat_test: Double, lon_test: Double, lat2: Double, lon2: Double, lat3: Double, lon3: Double, lat4: Double, lon4: Double)Boolean
sentinel_metadata: org.apache.spark.rdd.RDD[(String, String)] = swift2d://sentinel_gda.sentinel/sentinel2/baltic/../*MSIL2A.xml MapPartitionsRDD[267] at wholeTextFiles at <console>:1271
xml: org.apache.spark.rdd.RDD[(String, scala.xml.Elem)] = MapPartitionsRDD[268] at map at <console>:1272
details: org.apache.spark.rdd.RDD[(String, String, String)] = MapPartitionsRDD[269] at map at <console>:1274
filtered: org.apache.spark.rdd.RDD[(String, String, String)] = MapPartitionsRDD[270] at filter at <console>:1280
products: org.apache.spark.rdd.RDD[(String, String)] = MapPartitionsRDD[271] at map at <console>:1282
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20170411T100031_N0204_R122_T34UCF_20170411T100025.SAFE,67.0965)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20170418T095031_N0204_R079_T34UCF_20170418T095030.SAFE,50.1098)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20170421T100031_N0204_R122_T34UCF_20170421T100240.SAFE,99.8617)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20170508T095031_N0205_R079_T34UCF_20170508T095032.SAFE,91.8642)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20170531T100031_N0205_R122_T34UCF_20170531T100235.SAFE,32.8572)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20170607T095031_N0205_R079_T34UCF_20170607T095031.SAFE,61.4143)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20170610T100031_N0205_R122_T34UCF_20170610T100027.SAFE,75.0991)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20170617T095031_N0205_R079_T34UCF_20170617T095029.SAFE,41.7291)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20170620T100031_N0205_R122_T34UCF_20170620T100453.SAFE,46.6275)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20170627T095031_N0205_R079_T34UCF_20170627T095027.SAFE,49.7995)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20170630T100031_N0205_R122_T34UCF_20170630T100025.SAFE,99.9491)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20170707T095031_N0205_R079_T34UCF_20170707T095257.SAFE,45.7965)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20170710T100031_N0205_R122_T34UCF_20170710T100239.SAFE,85.2005)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20170720T100031_N0205_R122_T34UCF_20170720T100027.SAFE,68.3783)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20170816T095031_N0205_R079_T34UCF_20170816T095031.SAFE,55.9549)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20170819T100031_N0205_R122_T34UCF_20170819T100421.SAFE,97.2313)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20170826T095031_N0205_R079_T34UCF_20170826T095030.SAFE,80.9862)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20170905T095031_N0205_R079_T34UCF_20170905T095028.SAFE,83.0785)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20170908T100031_N0205_R122_T34UCF_20170908T100354.SAFE,55.0177)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20170915T095031_N0205_R079_T34UCF_20170915T095026.SAFE,40.4463)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20171005T095031_N0205_R079_T34UCF_20171005T095027.SAFE,91.4725)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20171008T100031_N0205_R122_T34UCF_20171008T100322.SAFE,23.9567)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20171015T095031_N0205_R079_T34UCF_20171015T095357.SAFE,98.2674)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20171018T100031_N0205_R122_T34UCF_20171018T100200.SAFE,41.8431)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20171028T100121_N0206_R122_T34UCF_20171028T133633.SAFE,96.8821)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20171104T095201_N0206_R079_T34UCF_20171104T115711.SAFE,95.1595)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20171224T095421_N0206_R079_T34UCF_20171224T114945.SAFE,97.2858)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20171227T100411_N0206_R122_T34UCF_20171227T120516.SAFE,71.5189)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20180103T095401_N0206_R079_T34UCF_20180103T115217.SAFE,66.9849)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20180106T100401_N0206_R122_T34UCF_20180106T120734.SAFE,91.63199999999999)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20180113T095341_N0206_R079_T34UCF_20180113T133650.SAFE,65.2867)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20180123T095311_N0206_R079_T34UCF_20180123T133625.SAFE,90.8843)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20180205T100211_N0206_R122_T34UCF_20180205T134941.SAFE,57.7342)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20180212T095121_N0206_R079_T34UCF_20180212T133804.SAFE,45.9965)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20180215T100111_N0206_R122_T34UCF_20180215T135533.SAFE,99.6037)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20180222T095031_N0206_R079_T34UCF_20180223T130143.SAFE,88.9586)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2A_MSIL2A_20180225T100021_N0206_R122_T34UCF_20180225T152458.SAFE,78.125275)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2B_MSIL2A_20180101T100409_N0206_R122_T34UCF_20180101T115822.SAFE,95.7907)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2B_MSIL2A_20180108T095359_N0206_R079_T34UCF_20180108T115106.SAFE,67.4124)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2B_MSIL2A_20180111T100349_N0206_R122_T34UCF_20180111T120726.SAFE,89.77290000000002)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2B_MSIL2A_20180118T095329_N0206_R079_T34UCF_20180118T115955.SAFE,44.631)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2B_MSIL2A_20180121T100319_N0206_R122_T34UCF_20180121T121824.SAFE,39.6254)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2B_MSIL2A_20180128T095239_N0206_R079_T34UCF_20180128T120611.SAFE,51.9906)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2B_MSIL2A_20180210T100139_N0206_R122_T34UCF_20180210T120626.SAFE,94.1816)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2B_MSIL2A_20180217T095049_N0206_R079_T34UCF_20180217T115355.SAFE,79.7399)
(swift2d://sentinel_gda.sentinel/sentinel2/baltic/S2B_MSIL2A_20180227T095019_N0206_R079_T34UCF_20180227T133522.SAFE,37.053881)
(swift2d://sentinel_gda.sentinel/sentinel2/poland/S2A_MSIL2A_20170531T100031_N0205_R122_T34UCF_20170531T100235.SAFE,32.8572)
(swift2d://sentinel_gda.sentinel/sentinel2/poland/S2A_MSIL2A_20170607T095031_N0205_R079_T34UCF_20170607T095031.SAFE,61.4143)
(swift2d://sentinel_gda.sentinel/sentinel2/poland/S2A_MSIL2A_20170610T100031_N0205_R122_T34UCF_20170610T100027.SAFE,75.0991)
(swift2d://sentinel_gda.sentinel/sentinel2/poland/S2A_MSIL2A_20170617T095031_N0205_R079_T34UCF_20170617T095029.SAFE,41.7291)
(swift2d://sentinel_gda.sentinel/sentinel2/poland/S2A_MSIL2A_20170620T100031_N0205_R122_T34UCF_20170620T100453.SAFE,46.6275)
(swift2d://sentinel_gda.sentinel/sentinel2/poland/S2A_MSIL2A_20170627T095031_N0205_R079_T34UCF_20170627T095027.SAFE,49.7995)
(swift2d://sentinel_gda.sentinel/sentinel2/poland/S2A_MSIL2A_20170630T100031_N0205_R122_T34UCF_20170630T100025.SAFE,99.9491)
(swift2d://sentinel_gda.sentinel/sentinel2/poland/S2A_MSIL2A_20170707T095031_N0205_R079_T34UCF_20170707T095257.SAFE,45.7965)
(swift2d://sentinel_gda.sentinel/sentinel2/poland/S2A_MSIL2A_20170710T100031_N0205_R122_T34UCF_20170710T100239.SAFE,85.2005)
(swift2d://sentinel_gda.sentinel/sentinel2/poland/S2A_MSIL2A_20170720T100031_N0205_R122_T34UCF_20170720T100027.SAFE,68.3783)
Found products =56
