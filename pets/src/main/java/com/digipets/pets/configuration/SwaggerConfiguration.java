package com.digipets.pets.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Tag;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket api() {
        return new Docket(springfox.documentation.spi.DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.digipets.pets.resources"))
        .build()
        .apiInfo(metadata())
        .tags(null, tags());
    }

    private ApiInfo metadata() {
        return new ApiInfoBuilder().title("DigiPets")
                .description("API de gestão de petshop.").version("1.0.0")
                .license("Apache License Version 2.0").licenseUrl("https://www.apache.org/licenses/LICENSE-2.0%22")
                .build();
    }

    private Tag[] tags() {
        return new Tag[] { new Tag("Cliente", "Gerencia clientes."),
                new Tag("Pet", "Gerencia pets.") };
    }
    
}