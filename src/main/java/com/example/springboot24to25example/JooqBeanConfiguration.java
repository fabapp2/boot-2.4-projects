package com.example.springboot24to25example;

import org.jooq.ConnectionProvider;
import org.jooq.conf.Settings;
import org.jooq.impl.DefaultConnectionProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;

@Configuration
public class JooqBeanConfiguration {

    @Bean
    ConnectionProvider connectionProvider() {
        Connection connection = null;
        return new DefaultConnectionProvider(connection);
    }

    @Bean
    Settings settings() {
        return new Settings();
    }
}
