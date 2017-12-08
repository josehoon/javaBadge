package com.familysearch.LoggingSample;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
//import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.LoggerFactory;

public class MyLoggingSample {

  public static void main(String[] args) {
    /** log.txt will be created in /src directory
    *   logback.xml is in com.familysearch directory
    */

    Logger logger = (Logger) LoggerFactory.getLogger(MyLoggingSample.class);
    LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
//    StatusPrinter.print(lc);

    logger.error("Error Message");
    logger.warn("Warn Message");
    logger.info("Info Message");
    logger.debug("Debug Message");

  }
}
