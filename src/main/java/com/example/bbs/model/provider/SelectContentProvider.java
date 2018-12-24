package com.example.bbs.model.provider;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SelectContentProvider {
	@Select("SELECT * FROM bbsmain ORDER BY createtime DESC")
    List<Map<String, Object>> getContent();
}
