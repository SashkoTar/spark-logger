package org.at.bowels

import org.apache.log4j.Logger
import org.apache.spark.{SparkConf, SparkContext}


object JobRunner {
  val logger =  Logger.getLogger(this.getClass.getName)

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("Logger Script")
    val sc = new SparkContext(conf)

    logger.info("SparkContext Has Been Created For Logger Script")

    val simpleRdd = sc.parallelize(1 to 300).repartition(4)

    logger.warn("RDD Has Been Repartitioned")

    val sum = simpleRdd.map(x => x * x).reduce(_ + _)

    logger.info(s"Calculated Sum = $sum")
    logger.warn("The Application Is About To Exit")
  }
}
