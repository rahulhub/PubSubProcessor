# PubSubProcessor
We will subscribe to queues , process data using DB blocikng queue and send live updates to downstreams. 
1. Create empty maven project in eclise
2. Add dependencies spring boot
<!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter -->
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter</artifactId>
			<version>2.5.0</version>
		</dependency>
 3. Create class PubSubProcessor with PSVM method
 4. Anotate this class with @SpringBootApplication
    A single @SpringBootApplication annotation can be used to enable those three features, that is:

    @EnableAutoConfiguration: enable Spring Boot’s auto-configuration mechanism
    @ComponentScan: enable @Component scan on the package where the application is located (see the best practices)
    @Configuration: allow to register extra beans in the context or import additional configuration classes
 5. Use @ImportResource({"classpath*:pubSubContext.xml"}) to import beans definitions 
 6. Add spring-boot-maven-plugin , without this you will get error "no main manifest attribute in jar"
