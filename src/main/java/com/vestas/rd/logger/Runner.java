package com.vestas.rd.logger;

import com.vestas.rd.logger.x.LoggerX;
import org.apache.log4j.Logger;

public class Runner {

    final static Logger logger = Logger.getLogger(Runner.class);

    public static void main(String[] args) {
        Runner obj = new Runner();
        obj.runMe("root");

        LoggerX x = new LoggerX();
        x.runMe("X");
    }

    private void runMe(String parameter){
        if(logger.isDebugEnabled()){
            logger.debug("This is debug : " + parameter);
        }

        if(logger.isInfoEnabled()){
            logger.info("This is info : " + parameter);
        }

        logger.warn("This is warn : " + parameter);
        logger.error("This is error : " + parameter);
        logger.fatal("This is fatal : " + parameter);
    }
}
