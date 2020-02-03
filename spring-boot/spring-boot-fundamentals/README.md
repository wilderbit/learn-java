
## Module 1 [Intro to Spring boot and Its Benefits]
Before this course
-
1. Spring Fundamentals
2. Spring: The Big Picture
3. Creating your First Spring Boot Application
4. Getting Started with Spring Data JPA

Prerequisites
-
JDK 1.8 +, Maven 3.0 + IDE + Git

Spring and spring boot
-
Spring boot is on top of Spring framework
Spring MVC, Spring Data, Spring Security, Spring Session, Spring AMQP, Spring Batch

Configuration Challenges 
-
XML config files, Config needed, Annotation based

[Structure](./spring-structure.png)
-
Application, Config, Controller, Service , Repo, Database and a tomcat server

Features
-
Auto Config, Starter dependencies, command line interface, Actuator

Auto config
-
Config app based on libraries, maven dependencies configured automatically

Starter Dependencies
-
spring-boot-starter-web, starter-test, starter-data-jpa, starter-thymeleaf

with `starter-data-jpa`

Spring Data JPA with Hibernate, JDBC, Entity manager, Transaction API, Spring DATA JPA, Aspects

with `starter-web`

Web app development, Spring MVC, REST, Tomcat, Jackson

Spring Boot CLI
-
- Command line interface
- Application written using groovy scripts 
- Rapid prototyping

Actuator(Allows to know what is going on inside the application)
-
- Monitor running app
- Manage via HTTP endpoints of JMX
- Health status, metrics, loggers, audit events, HTTP trace
### [Gitlab Code](https://gitlab.com/videolearning/spring-fundamentals)

## Module 2 [Bootstrapping a Simple Application]

1. Spring Init
2. Automatic Config 
3. Annotations
4. Profiles

Spring Init
-
Go to [Spring Init](https://start.spring.io). Here we can create basic application with some default mvn dependencies.

- Build with maven `mvn clean install -DskipTests=true`

Demo Auto Configuration
-
Finds JARs on the classpath and auto-configures bean.

Add your own beans, like a datasource bean

Start Application with `--debug` switch 

Add a simple property to application.properties

Add the Spring Boot Actuator

@SpringBootApplication Annotation
-
Shortcut for three annotations
- @SpringBootConfiguration (Replaces @Configurations and annotates a class as a configurations).
- @EnableAutoConfiguration (Tell Spring boot to configure a beans).
- @ComponentScan (Tells Spring boot ato scan current package and subpackages).

Spring Boot Properties
-
Configuration file for application

[Application properties](https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html)

[Common Application Properties](https://docs.spring.io/spring-boot/docs/1.1.6.RELEASE/reference/html/common-application-properties.html)

Spring Boot Profiles
-
Profile is for different environment(Development, test, Production).

```properties
# Define active profile
spring.profiles.active = dev
```
Naming format
- `applications-{profile}.properties`
- `applications-dev.properties`
- `applications-test.properties`
- `applications-prod.properties`

## Module 3 [Accessing data with Spring boot and H2]
- Data access
- Benefits of Spring with JPA
- Default configurations
- Querying using repositories

H2 DataBase 
-
- In Memory Database written in JAVA(Open Source), Good for POC's, dev envs, Admin via H2 Console.

H2 dependency
-
Auto configures H2 related properties
```xml
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>runtime</scope>
</dependency>
```
Latest 
```xml
<!-- https://mvnrepository.com/artifact/com.h2database/h2 -->
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <version>1.4.200</version>
    <scope>test</scope>
</dependency>


```

H2 Defaults props 
```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.h2.console.enabled=false
```

By design, the in-memory database is volatile and data will be lost when we restart the application.
We can change that behavior by using file-based storage. To do this we need to update the spring.datasource.url

`spring.datasource.url=jdbc:h2:file:/data/demo`

We can access only if `spring.h2.console.enabled=true`

Accessing the H2 Console
-

Run spring boot server and open url `localhost:8080/h2`

ORM with JPA
-
DataBase -> JDBC -> JPA -> Spring Data JPA(Hibernate)

Hibernate(Popular JPA implementation), Spring Data JPA, Spring ORM
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
```

Entities
-
Entities are objects that living in Database, They have ability to map to a database.

Entities are defined by `@Entity` Annotation.