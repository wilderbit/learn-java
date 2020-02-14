# Spring Framework: Spring Fundamentals

### What is Spring
Spring is a Dependency Injection Container
- Inversion of Control
- Dependency Injection
- Java without Enterprise JavaBeans
- POJO(Plain Old Java Object) Based
- AOP/Proxies
- Best Practices(Using Design Pattern)

The Problem
-
- Testability
- Maintainability
- Scalability
- Complexity
- Business Focus

The Solution 
-
- Remove configuration code and focus on business
- Testing
- Annotation or XML Based
- Interface Based

Getting Spring
-

- No direct download
- Download using Maven
- Maven repo has (Source JavaDocs, Binaries)
- Transitive dependencies
- Spring Boot

Spring Download Maven 
-
```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>5.2.0.RELEASE</version>
</dependency>
```

### Spring Config Using Java
- Most preferred method for config
- No applicationContext.xml
- @Configuration (applicationContext.xml is replaced by @Configuration)
- @Configuration at class level
- Spring Beans defined by @Bean
- @Bean at method level
- Classes and methods name in Config can be anything

```java
@Configuration
public class AppConfig {
    @Bean(name = "customerRepository")
    public CustomerRepo getCustomerRepo(){
        return new HibernateCustomerRepoImpl();
    }   
}
```

Setter Injection
-
- Simple as a method call
- "Mystery" of Injection goes away
- These beans all are singleton and Initialize only first time of calling. 
- Setter Injection simply calling a setter
```java
@Configuration
public class AppConfig {
    @Bean(name = "customerRepository")
    public CustomerRepo getCustomerRepo(){
        return new HibernateCustomerRepoImpl();
    }

    @Bean(name = "customerService")
    public CustomerService getCustomerService(){
        CustomerServiceImpl impl = new CustomerServiceImpl();
        impl.setCustomerRepo(getCustomerRepo());
        return impl;
    }   
}

```

Constructor Injection
-
- Just Like setter injection


### Spring Scopes and Autowiring
- Scope != Pattern

Scopes
- 
5 Scopes
- Singleton
- Prototype

Valid Only in web-aware Spring projects 
- Request
- Session
- Global
 
Singleton
-
- One instantiation 
- Default bean scope
- Single instance per Spring container

```java
@Service("customerService")
@Scope("singleton")
public class CustomerServiceImpl {}

// Singleton Java Config=
// @Scope
// Requires AOP jar
```

Prototype
-
- Instance per request
- Guaranteed unique instance per request
- Opposite of Singleton

```java
@Service("customerService")
@Scope("prototype")
public class CustomerServiceImpl {}
```

Web Scopes 
-
- Request (Bean per Http Request)
- Session (Bean per spring session)
- Global Session (Single Bean per session)

Autowired
-
- @ComponentScan
- Use @Autowired for getting autowired @Bean
- By name or Instance Type

Stereotypes Annotations
-
- @Component (Same as @Bean(Only applicable on method level, cannot use at class level))
- @Repository
- @Service (Where to put business logic)

Why to use XML configurations
-
- First approach
- Simpler
- Separation of concerns

Autowiring
-
- Spring automatically wires beans
- Four type of autowiring
- byType in case on Single Instance
- byName (Only One Instance of a class)
- constructor
- no (No autowiring)

Advanced Bean Configuration
-
- BeanPostProcessor
- FactoryBean
- SpEL
- Proxies
- Profiles

Bean Lifecycle
-
- Instantiation -> Populate Properties -> BeanNameAware -> BeanFactoryAware -> Pre Init - BeanPostProcessors 
    -> Initialization -> InitMethod -> PostInit - BeanPostProcessors

FactoryBean
-
- Build on initMethod
- Factory Method Pattern
- Legacy Code
- Contract without Constructor
- Static methods

SpEL
-
- Manipulate Object Graph
```java
@Value("#{ T(java.lang.Math).random() * 100.0 }")
private double seedNumber;
```
- Evaluate at Runtime
- Configuration

