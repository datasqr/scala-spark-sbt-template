import org.apache.spark.{SparkConf, SparkContext}

object MainExample {

  def main(args:Array[String]): Unit ={

    println("Hello")

    // initialise spark context
    val conf = new SparkConf()
      .setAppName("HelloWorld")
      .setMaster("local")
    val sc = new SparkContext(conf)

    val testArray = Array(List("1","2","3","4"), List("1","2","3","4"), List("1","2","3","4"))

    val rddTest = sc.parallelize(testArray)
    rddTest.foreach(println)

    // do stuff
    println("************")
    println("************")
    println("Hello, world!")
    println("************")
    println("************")

    // terminate spark context
    sc.stop()

  }

}
