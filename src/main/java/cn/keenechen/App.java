package cn.keenechen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;

public class App {
    // TRACE < DEBUG < INFO < WARN < ERROR
    static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        System.out.println(lc);
        
        logger.info("hello");
        logger.debug("hello");
        logger.trace("hello");
    }
}
