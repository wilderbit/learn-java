
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