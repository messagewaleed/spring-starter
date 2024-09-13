package com.socgen.waleed.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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
	
	User getAllUserDetailsById(Integer id) {

		return jdbcTemplate
				.queryForObject("select * from user where userId = ?", new UserMapper(), id);
	}
	
	List<User> getAllUsersWithAllTheirDetails() {

		return jdbcTemplate
				.query("select * from user", new RowMapper<User>() {
					@Override
					public User mapRow(ResultSet rs, int rowNum) throws SQLException {
						
						return new User(rs.getInt("userId"), rs.getString("userName"), rs.getString("userAddress"));
					}
				});
	}
	
	void registerNewUser(User user) {
		
		jdbcTemplate.update(
				"insert into user(userName, userAddress) values(?,?)",
				user.getUserName(),
				user.getUserAddress()
				);
		
	}
	
	
	
	class UserMapper implements RowMapper<User>{

		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			return new User(rs.getInt("userId"), rs.getString("userName"), rs.getString("userAddress"));
		}
		
	}
	
//	RowMapper
	
//	JdbcTemplate - Spring's solution to jdbc
	
	
//	void func(Object... values) {0-n
//		
//	}
	
	
	
	
	
	
}