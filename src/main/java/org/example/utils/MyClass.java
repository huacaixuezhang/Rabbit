package org.example.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyClass {
    private static final Logger logger = LoggerFactory.getLogger(MyClass.class);

    public void myMethod() {
        logger.info("This is an info message");
        logger.debug("This is a debug message");
        logger.error("This is an error message");
    }
}
