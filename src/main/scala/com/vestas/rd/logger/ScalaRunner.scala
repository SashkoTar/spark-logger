package com.vestas.rd.logger

import com.vestas.rd.logger.x.LoggerX
import org.apache.log4j.{LogManager, Logger}


class ScalaRunner {

  val logger =  Logger.getLogger(this.getClass.getName)

  def runMe(parameter: String): Unit = {
    if (logger.isDebugEnabled) logger.debug("This is debug with name : " + parameter)

    if (logger.isInfoEnabled) logger.info("This is info with name : " + parameter)

    logger.warn("This is warn with name : " + parameter)
    logger.error("This is error with name : " + parameter)
    logger.fatal("This is fatal with name : " + parameter)
  }

}

object ScalaRunner {

  def main(args: Array[String]): Unit = {



    val obj = new ScalaRunner
    obj.runMe("root")

    val x = new LoggerX
    x.runMe("X")
  }

}
