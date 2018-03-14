#!/bin/bash

HDFS_CONF_DIR= #<hdfs path where log4j.properties should be located>
MAIN_JAR_LIB="logger-1.0.jar"
SPARK_SCRIPT_OPTIONS="--master yarn-cluster --driver-memory 5G --executor-memory 3G --num-executors 4 --executor-cores 2"
DRIVER_JAVA_OPTION="--conf spark.driver.extraJavaOptions=-Dlog4j.configuration=log4j-driver.properties"
FILES="--files $HDFS_CONF_DIR/log4j-driver.properties"
/usr/bin/spark-submit --class org.at.bowels.JobRunner $DRIVER_JAVA_OPTION  $FILES $SPARK_SCRIPT_OPTIONS  $MAIN_JAR_LIB
