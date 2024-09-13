package com.socgen.waleed.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dbOperate")
public class DbOperate {
	
	JdbcTemplate jdbcTemplate;
	
	DataSource dataSource;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	Integer getCountOfLearners() {
		return jdbcTemplate.queryForObject("select count(*) from user", Integer.class);
	}
	
	String  getUserNameById(Integer id) {
		return jdbcTemplate.queryForObject("select userName from user where userId = ?", String.class, id);
	}
	
	
//	JdbcTemplate - Spring's solution to jdbc
	
	
//	void func(Object... values) {0-n
//		
//	}
	
	
	
	
	
	
}