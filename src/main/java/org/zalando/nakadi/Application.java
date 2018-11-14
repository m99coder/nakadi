package org.zalando.nakadi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.zalando.nakadi", "org.zalando.nakadi.config"})
public class Application {

    public static void main(final String[] args) {
        java.security.Security.setProperty("networkaddress.cache.ttl" , "10");
        SpringApplication.run(Application.class, args);
    }
}
