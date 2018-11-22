package com.jaswine.core.controller;


import com.jaswine.beans.dto.Dto;
import com.jaswine.core.bean.SysRole;
import com.jaswine.core.service.SysRoleService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 系统角色controller
 * @author Jaswine
 */
@RequestMapping("/sysrole/")
@RestController
@Slf4j
@Api(value = "系统角色",basePath = "/sysrole/")
public class SysRoleController {

	@Autowired
	private SysRoleService sysRoleService;


	@PostMapping
	public Dto addRole(@RequestBody SysRole sysRole){
		log.info("[SysRoleController]新增角色");
		return sysRoleService.addRole(sysRole);
	}
}
