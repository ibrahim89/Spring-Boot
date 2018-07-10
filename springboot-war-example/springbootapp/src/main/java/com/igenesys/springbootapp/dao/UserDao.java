package com.igenesys.springbootapp.dao;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.igenesys.springbootapp.model.BaseReturn;
import com.igenesys.springbootapp.model.ResponseStatus;
import com.igenesys.springbootapp.model.User;

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
    public BaseReturn saveUSer(User getParamters){
    	
    	UUID userid =UUID.randomUUID();
    	String userId = userid.toString();
    	String sql = "INSERT INTO public.user(userid, user_name, password, first_name, last_name, email)VALUES (?, ?, ?, ?, ?, ?);";
    	jdbcTemplate.update(sql,new Object[]{
    			userId,getParamters.getUsername(),getParamters.getPassword(),getParamters.getFirstname(),getParamters.getLastname(),getParamters.getEmail()
    	});
    	
    	ResponseStatus responseStatus = ResponseStatus.SUCCESS;
    	return new BaseReturn(responseStatus.name(), responseStatus.getValue());
    }
    public BaseReturn updateUser(User getParameters){
    	String sql ="UPDATE public.user SET  user_name=?, password=?, first_name=?, last_name=?, email=? WHERE userid=?";
    	jdbcTemplate.update(sql,new Object[]{
    			getParameters.getUsername(),getParameters.getPassword(),getParameters.getFirstname(),getParameters.getLastname(),getParameters.getEmail(),getParameters.getUserid()
    	});
    	ResponseStatus responseStatus = ResponseStatus.SUCCESS;
    	return new BaseReturn(responseStatus.name(), responseStatus.getValue());
    }
}
