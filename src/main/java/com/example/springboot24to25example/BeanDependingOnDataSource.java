package com.example.springboot24to25example;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.sql.init.dependency.DependsOnDatabaseInitialization;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
@DependsOnDatabaseInitialization
@RequiredArgsConstructor
public class BeanDependingOnDataSource {
    private final DataSource dataSource;
}
