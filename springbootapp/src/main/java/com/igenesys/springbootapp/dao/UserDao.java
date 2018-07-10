package com.igenesys.springbootapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.igenesys.springbootapp.model.BaseReturn;
import com.igenesys.springbootapp.model.ResponseStatus;

@Repository
public class UserDao {
    @Autowired
	JdbcTemplate jdbcTemplate;
    
    public BaseReturn getAllUser(){
    	String sql = "select *from public.user";
    	List rs = jdbcTemplate.queryForList(sql);
    	ResponseStatus responseStatus = ResponseStatus.SUCCESS;
    	return new BaseReturn(responseStatus.name(), responseStatus.getValue(),rs);
    }
}
