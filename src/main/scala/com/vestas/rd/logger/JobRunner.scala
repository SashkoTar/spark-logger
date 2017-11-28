package com.vestas.rd.logger

import org.apache.log4j.Logger
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.hive.HiveContext

class JobRunner {
  val logger =  Logger.getLogger(this.getClass.getName)

  def start() = {
    logger.info("Started reading turbines")
  }

  def stopped(count : Long) = {
    logger.info(s"Finished reading turbines: $count")
  }

}

object JobRunner {



  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("Benchmarker Script")
    val context = new SparkContext(conf)
    val sqlContext = new HiveContext(context)
    val cl = new JobRunner

    cl.start()
    val turbinesRdd = context.textFile("/user/oltar/test/turbines.csv")
    cl.stopped(turbinesRdd.count())

  }

}
