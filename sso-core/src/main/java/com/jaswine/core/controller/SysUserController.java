package com.jaswine.core.controller;

import com.jaswine.beans.dto.Dto;
import com.jaswine.core.bean.SysUser;
import com.jaswine.core.service.SysUserService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户相关Controller
 * <p>
 *     系统用户的相关操作API
 * </p>
 * @author Jaswine
 */
@RestController
@RequestMapping("/sysuser/")
@Api(value = "用户API",basePath = "/sysuser/")
@Slf4j
public class SysUserController {

	@Autowired
	private SysUserService sysUserService;

	/**
	 * 新增用户
	 * @param sysUser 用户
	 * @return 信息
	 */
	@PostMapping
	public Dto addUser(@RequestBody SysUser sysUser){
		log.info("[SysUserController]新增用户");
		return sysUserService.addUser(sysUser);
	}

}
