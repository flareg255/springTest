package com.example.bbs.model.provider;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.bbs.model.form.InputFormUser;

@Mapper
public interface InputUserFormProvider {

	@InsertProvider(type = BbsInsertProbider.class,method="toInsert")
	public void insert(InputFormUser inputFormUser);

	public static class BbsInsertProbider extends SQL{
		@Autowired
	    PasswordEncoder passwordEncoder;

		@Bean
	    PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }

		public String toInsert(InputFormUser inputFormUser) {

			INSERT_INTO("users");
			VALUES("username","'" + inputFormUser.getUsername() + "'");
			VALUES("userpassword","'" + passwordEncoder.encode(inputFormUser.getPassword()) + "'");

			return toString();
		}

	}
}
