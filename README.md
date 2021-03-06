# Steps to get this REST Api Spring Boot Server running

1. Change the parent to spring boot 2.4

`<parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.4.0</version>
        <relativePath/> <!-- lookup parent from repository -->
</parent>`

2. Set the version of spring-openapi-ui

`<dependency>
            <groupId>org.springdoc</groupId>
            <artifactId>springdoc-openapi-ui</artifactId>
            <version>1.5.0</version>
        </dependency>`

3. Remove @EnableOpenApi Annotation in Swagger2SpringBoot.java

3a. Remove the Imports for mentioned Annotation

4. Organize Imports in the following classes:
- Article.java
- ArticleApiController.java
- ArticleApi.java

5. Get it running by executing mvn clean install and Play Button in your IDE



# Swagger generated server

Spring Boot Server 


## Overview  
This server was generated by the [swagger-codegen](https://github.com/swagger-api/swagger-codegen) project.  
By using the [OpenAPI-Spec](https://github.com/swagger-api/swagger-core), you can easily generate a server stub.  
This is an example of building a swagger-enabled server in Java using the SpringBoot framework.

The underlying library integrating swagger to SpringBoot is [springdoc-openapi](https://github.com/springdoc/springdoc-openapi)

Start your server as an simple java application  

You can view the api documentation in swagger-ui by pointing to  
http://localhost:8080/  

Change default port value in application.properties