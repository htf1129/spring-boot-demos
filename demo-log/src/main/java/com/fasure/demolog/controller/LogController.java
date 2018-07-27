package com.fasure.demolog.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LogController {
    private static final Logger logger = LoggerFactory.getLogger(LogController.class);

    @RequestMapping("/demo")
    public String test() {
        logger.debug("debug log");

        logger.info("info log");

        logger.warn("warn log");

        logger.error("error log");

        return "hello world";
    }
}
