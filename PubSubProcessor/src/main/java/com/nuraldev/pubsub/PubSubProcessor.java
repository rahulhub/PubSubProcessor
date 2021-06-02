package com.nuraldev.pubsub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath*:pubSubContext.xml"})
public class PubSubProcessor {

	public static void main(String[] args) {
		SpringApplication.run(PubSubProcessor.class, args);
	}

}
