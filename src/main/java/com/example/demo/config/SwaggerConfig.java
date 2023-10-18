package com.example.demo.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title = "MentorUS Backend", description = "BE API specification for web dashboard and mobile app", version = "0.0.1"))
public class SwaggerConfig {

}
