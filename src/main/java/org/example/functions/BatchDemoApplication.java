package org.example.functions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
public class BatchDemoApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(BatchDemoApplication.class, args);
    }
}