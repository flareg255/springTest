package com.example.bbs.security.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.bbs.model.entity.LoginUserDetails;
import com.example.bbs.model.provider.UserProvider;

@Service
public class LoginUserDetailsService implements UserDetailsService {

	@Autowired
	private UserProvider userProvider;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Map<String, Object> user = userProvider.getUser(username);

		if (user == null) {
            throw new UsernameNotFoundException(String.format("Username not found, username=%s", username));
        }

		return new LoginUserDetails(user);
	}

}
