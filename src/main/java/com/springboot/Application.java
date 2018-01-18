package com.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
* @author WeiPeng Li
*/
@SpringBootApplication
@EnableScheduling
public class Application {
	private static final Logger log = LoggerFactory.getLogger(Application.class);
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        String[] activeProfiles = ctx.getEnvironment().getActiveProfiles();
        for (String profile : activeProfiles) {
            log.info("spring boot 使用profile为:" + profile);
        }
        long endTime = System.currentTimeMillis();
        log.info(" spring-boot-kafka 启动完毕,用时(" + (endTime - startTime) + "毫秒 )");
    }


}
