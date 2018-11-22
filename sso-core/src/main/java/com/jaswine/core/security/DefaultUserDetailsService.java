package com.jaswine.core.security;

import com.jaswine.core.bean.SysUser;
import com.jaswine.core.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * 默认的用户鉴别service
 *
 * @author Jaswine
 */
@Component
public class DefaultUserDetailsService implements UserDetailsService {

	@Autowired
	private SysUserService userService;

	@Override
	public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
		SysUser user = userService.getUserByUsername(s);

		return new User(user.getUserName(),user.getPassword(),user.getAuthorities());

	}
}
