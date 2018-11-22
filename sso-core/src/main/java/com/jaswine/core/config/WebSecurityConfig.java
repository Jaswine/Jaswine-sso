package com.jaswine.core.config;


import com.jaswine.core.security.DefaultUserDetailsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;


/**
 * Web请求security配置
 * @author Jaswine
 */
@Configuration
@EnableWebSecurity
@Slf4j
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


	@Autowired
	private DefaultUserDetailsService defaultUserDetailsService;


	/**
	 * 保护HTTP请求
	 * @param http http请求
	 * @throws Exception 异常
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.anyRequest().authenticated()
				.and()
				.formLogin()
				.and()
				.httpBasic();
		log.info("[WebSecurityConfig]配置HTTP安全");
	}

	/**
	 * 基于数据库的认证
	 * @param auth 认证
	 * @throws Exception 异常
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(defaultUserDetailsService);
		log.info("[WebSecurityConfig]基于数据库的权限认证");
	}


	/**
	 * SpringSecurity密码加密
	 *
	 * @return BCryptPasswordEncoder
	 */
	@Bean
	public PasswordEncoder passwordEncoder(){
		log.info("[WebSecurityConfig]配置密码加密方式");
		return new BCryptPasswordEncoder();
	}


}
