package com.example.bbs.model.provider;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.bbs.model.form.InputFormUser;

@Mapper
public interface InputUserFormProvider {

	@InsertProvider(type = UserInsertProbider.class,method="toInsert")
	public void insert(InputFormUser inputFormUser);

	public static class UserInsertProbider extends SQL{

		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

		public String toInsert(InputFormUser inputFormUser) {

			System.out.println(inputFormUser.getPassword());
			INSERT_INTO("users");
			VALUES("username","'" + inputFormUser.getUsername() + "'");
			VALUES("userpassword","'" + passwordEncoder.encode(inputFormUser.getPassword()) + "'");

			return toString();
		}

	}
}
