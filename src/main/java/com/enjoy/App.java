package com.enjoy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/4/21
 */
@SpringBootApplication
@PropertySource(value = "classpath:test.properties")
public class App implements CommandLineRunner {
    private static Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);

        System.out.println(context.getEnvironment().getProperty("rocketmq.producer.group"));
        System.out.println(context.getEnvironment().getProperty("app.test.name"));
    }

    @Override
    public void run(String... args) throws Exception {
        log.trace("======trace");
        log.debug("======debug");
        log.info("======info");
        log.warn("======warn");
        log.error("======error");
    }
}
