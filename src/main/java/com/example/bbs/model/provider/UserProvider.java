package com.example.bbs.model.provider;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserProvider {
	@Select("SELECT * FROM users WHERE username = '${name}'")
    Map<String, Object> getUser(@Param("name") String name);
}