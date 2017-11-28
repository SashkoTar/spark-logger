#!/bin/bash


#JAR_LIB="lib/bi_vestas-1.0-SNAPSHOT.jar"
MAIN_JAR_LIB="logger-1.0.jar"
SPARK_SCRIPT_OPTIONS=" --master yarn-client --driver-memory 20G --executor-memory 20G --num-executors 100 --executor-cores 2"
#APP_ARGUMENTS="$HADOOP_APP_DIR $HADOOP_HIVE_DATABASE"

#/usr/bin/spark-submit --class com.vestas.ac.Runner --jars $JAR_LIB $SPARK_SCRIPT_OPTIONS $MAIN_JAR_LIB $APP_ARGUMENTS
/usr/bin/spark-submit --class com.vestas.rd.logger.JobRunner --conf "spark.driver.extraJavaOptions=-Dlog4j.configuration=file:///ifs/home/oltar/projects/sandbox/spark_issue/log4j-d.properties" $SPARK_SCRIPT_OPTIONS $MAIN_JAR_LIB
