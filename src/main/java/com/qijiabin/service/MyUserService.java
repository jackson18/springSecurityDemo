package com.qijiabin.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.qijiabin.entity.User;

@Component(value="myUserService")
public class MyUserService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// 从数据库中获取用户信息
		System.out.println("load user by username...........");
		User user = new User("admin", "admin", "ROLE_ADMIN");
		return user;
	}

}
