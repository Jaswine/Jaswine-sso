package com.jaswine.core.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Web请求security配置
 * @author Jaswine
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	private static final Logger LOGGER = LoggerFactory.getLogger(WebSecurityConfig.class);


	/**
	 * 基于内存的认证
	 * @param auth 认证
	 * @throws Exception 异常
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
				.withUser("jasmine").password("Jasmine").roles("USER")
				.and()
				.withUser("wang").password("Jasmine").roles("ADMIN");
	}

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
		LOGGER.info("[WebSecurityConfig]配置HTTP安全");
	}
}
