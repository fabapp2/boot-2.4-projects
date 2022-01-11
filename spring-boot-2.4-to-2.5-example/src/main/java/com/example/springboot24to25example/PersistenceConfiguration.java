package com.example.springboot24to25example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {

    @Bean
    AnotherBeanDependingOnDataSource anotherBeanDependingOnDataSource(DataSource dataSource) {
        AnotherBeanDependingOnDataSource anotherBeanDependingOnDataSource = new AnotherBeanDependingOnDataSource();
        anotherBeanDependingOnDataSource.setDataSource(dataSource);
        return anotherBeanDependingOnDataSource;
    }

}
