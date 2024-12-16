package com.example.AddMultipleDB.Service;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class MultiDbService {

    private final JdbcTemplate jdbcTemplate1;
    private final JdbcTemplate jdbcTemplate2;

    public MultiDbService(
            @Qualifier("jdbcTemplate1") JdbcTemplate jdbcTemplate1,
            @Qualifier("jdbcTemplate2") JdbcTemplate jdbcTemplate2) {
        this.jdbcTemplate1 = jdbcTemplate1;
        this.jdbcTemplate2 = jdbcTemplate2;
    }

    public void insertIntoDb1(String name) {
        String sql = "INSERT INTO timepass (name) VALUES (?)";
        jdbcTemplate1.update(sql, name);
    }

    public void insertIntoDb2(String name) {
        String sql = "INSERT INTO timepass (name) VALUES (?)";
        jdbcTemplate2.update(sql, name);
    }
}

