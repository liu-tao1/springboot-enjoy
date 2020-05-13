package com.enjoy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/4/21
 */
@SpringBootApplication
public class App {
    private static Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);
        log.trace("======trace");
        log.debug("======debug");
        log.info("======info");
        log.warn("======warn");
        log.error("======error");
    }
}
