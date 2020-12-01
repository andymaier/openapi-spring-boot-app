package io.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-12-01T13:09:57.424Z[GMT]")
@Configuration
public class SwaggerDocumentationConfig {

    /*@Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.OAS_30)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("io.swagger.api"))
                    .build()
                .directModelSubstitute(org.threeten.bp.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(org.threeten.bp.OffsetDateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }*/
    @Bean
    public OpenAPI configure() {
        return new OpenAPI()
            .info(new Info()
                .title("Katalog API")
                .description("Katalog API")
                .termsOfService("")
                .version("1")
                .license(new License()
                    .name("")
                    .url("http://unlicense.org"))
                .contact(new Contact()
                    .email("")));
    }

}
