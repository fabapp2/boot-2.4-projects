package com.example.springboot24to25example;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
@RequiredArgsConstructor
public class BeanDependingOnDataSource {
    private final DataSource dataSource;
}
