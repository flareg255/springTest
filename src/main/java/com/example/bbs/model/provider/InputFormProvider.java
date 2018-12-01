package com.example.bbs.model.provider;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.jdbc.SQL;

import com.example.bbs.model.form.InputForm;

@Mapper
public interface InputFormProvider {

	@InsertProvider(type = BbsInsertProbider.class,method="toInsert")
	public void insert(InputForm inputForm, String name);

	public static class BbsInsertProbider extends SQL{
		public String toInsert(InputForm inputForm, String name) {

			INSERT_INTO("bbsmain");
			VALUES("title","'" + inputForm.getTitle() + "'");
			VALUES("creater","'" + name + "'");
			VALUES("contents","'" + inputForm.getContents() + "'");
			VALUES("createtime","now()");

			return toString();
		}

	}
}
