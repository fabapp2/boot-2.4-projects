package com.example.springboot24to25example;

import javax.sql.DataSource;

public class AnotherBeanDependingOnDataSource {
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
