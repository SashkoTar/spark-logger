package com.vestas.rd.logger.x;

import org.apache.log4j.Logger;

public class LoggerX {
    final static Logger logger = Logger.getLogger(LoggerX.class);

    public void runMe(String parameter) {
        if(logger.isDebugEnabled()){
            logger.debug("This is debug with name : " + parameter);
        }

        if(logger.isInfoEnabled()){
            logger.info("This is info with name : " + parameter);
        }

        logger.warn("This is warn with name : " + parameter);
        logger.error("This is error with name : " + parameter);
        logger.fatal("This is fatal with name : " + parameter);
    }

}
