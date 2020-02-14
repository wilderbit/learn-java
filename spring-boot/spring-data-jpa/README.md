# Getting Started with Spring Data JPA

#### [Git Repository](https://github.com/dlbunker/ps-guitar-db)
-  What can spring data JPA Do?
- What is Spring Data JPA
    - Enhance standard JPA with Spring
    - Simplifies Data Access Layer
    - Repository generator
    - Query DSL(Domain Specific Language)
    - Auditing paging


Before This
- 
- Spring with JPA and Hibernate(Hansen)
- Java Persistence 2.2(Goncalves)
- Core Spring (Spring Fundamentals(Hansen))

Choosing Java Data Access Layer
-
- Spring JDBC(if Simple DB's Native SQL needs Reports)
- JEE 7 Batch, Spring Batch Hadoop(If high number of SQL writes. (JPA is not good for massive amount of data store because ORM 
  generally first cached the data in the memory and then updates it into DB)).
- ORM, JPA/Hibernate, Spring Data JPA (if Data Graphs without excessive relationship).
- NoSql, MongoDB, Spring Data Mongo(If Topic or thread Relational DTA)

Spring Data
-
- Spring Data Commons
  - Repository
  - Cross-Store persistence
  - Dynamic query generation

- Spring Data JPA
  - MongoDB
  - Redis
  - Hadoop 
  - Rest
  - SOLR
  - Cassandra
  - Couchbase
  - DynamoDb
  - Elastic Search
  
Installing Spring Data JPA
-
```xml
<dependency>
    <groupId>org.springframework.data</groupId>
    <artifactId>spring-data-jpa</artifactId>
</dependency>
```

```xml
<!--Put this line into application-context.xml-->
<jpa:repository base-package="com.guitar.db.repository"/>
```
or Use Annotation `@EnableJpaRepository`