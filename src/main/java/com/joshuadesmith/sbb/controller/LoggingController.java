package com.joshuadesmith.sbb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("logs")
public class LoggingController {

    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @GetMapping
    public void printExampleLogs() {
        logger.trace("An example TRACE log");
        logger.debug("An example DEBUG log");
        logger.info("An example INFO log");
        logger.warn("An example WARN log");
        logger.error("An example ERROR log");
    }
}
