package com.example.bbs.model.provider;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.jdbc.SQL;

import com.example.bbs.model.form.InputForm;

@Mapper
public interface InputFormProvider {

	@InsertProvider(type = BbsInsertProbider.class,method="toInsert")
	public void insert(InputForm inputForm);

	public static class BbsInsertProbider extends SQL{
		public String toInsert(InputForm inputForm) {

			INSERT_INTO("bbsmain");
			VALUES("title","'" + inputForm.getTitle() + "'");
			VALUES("creater","'" + inputForm.getTitle() + "'");
			VALUES("contents","'" + inputForm.getContents() + "'");
			VALUES("createtime","now()");

			return toString();
		}

	}
}
