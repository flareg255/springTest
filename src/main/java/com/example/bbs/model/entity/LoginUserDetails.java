package com.example.bbs.model.entity;

import java.util.Map;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

public class LoginUserDetails extends User {

	private final Map<String, Object> user;

    public LoginUserDetails(Map<String, Object> user) {
        super(user.get("username").toString(), user.get("userpassword").toString(), AuthorityUtils.createAuthorityList("ROLE_USER"));
        this.user = user;
    }

    public Map<String, Object> getUser() {
        return user;
    }
}
