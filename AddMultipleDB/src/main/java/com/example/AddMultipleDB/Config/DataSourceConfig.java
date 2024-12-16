package com.example.AddMultipleDB.Config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean(name = "dataSource1")
    @ConfigurationProperties(prefix = "spring.datasource.db1")
    public DataSource dataSource1() {
        return DataSourceBuilder.create()
                .url("jdbc:mysql://localhost:3306/adddb")
                .username("root")
                .password("url")
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .build();
    }

    @Bean(name = "dataSource2")
    @ConfigurationProperties(prefix = "spring.datasource.db2")
    public DataSource dataSource2() {
        return DataSourceBuilder.create()
                .url("jdbc:oracle:thin:@localhost:1521:xe")
                .username("eidiko schema")
                .password("sarasu10")
                .driverClassName("oracle.jdbc.driver.OracleDriver")
                .build();
    }
}

