package com.jaswine.core.service;

import com.jaswine.beans.dto.Dto;
import com.jaswine.core.bean.SysUser;

/**
 * 系统用户service
 *
 * @author Jaswine
 */
public interface SysUserService {

	/**
	 * 新增用户
	 * @param sysUser 用户
	 * @return 信息
	 */
	Dto addUser(SysUser sysUser);

	SysUser getUserByUsername(String s) throws NullPointerException;
}
