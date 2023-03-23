package com.youngstanis.codedocumentconverter.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {
    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI().info(
                        new Info()
                                .title("Converter")
                                .contact(
                                        new Contact()
                                                .email("stanislav.skii2000@mail.ru")
                                                .name("Stanislav Grokhotov")
                                )

        );
    }
}
