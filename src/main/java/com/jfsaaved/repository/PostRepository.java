package com.jfsaaved.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.jfsaaved.domain.Post;

public class PostRepository {
	
	private final JdbcTemplate jdbc;
	
	@Autowired
	public PostRepository(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	
	public Post findFirstByOrderByPostedOnDesc() {
		return null;
	}
	
	public List<Post> findAllByOrderPostPostedOnDesc() {
		return null;
	}

}
