package com.jaswine.sso.service.impl;

import com.jaswine.beans.dto.Dto;
import com.jaswine.core.bean.SysRole;
import com.jaswine.core.dao.SysRoleDao;
import com.jaswine.core.service.SysRoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 角色Service实现类
 *
 * @author Jaswine
 */
@Service
@Slf4j
public class SysRoleServiceImpl implements SysRoleService {

	@Autowired
	private SysRoleDao sysRoleDao;


	@Override
	public Dto addRole(SysRole sysRole) {
		sysRoleDao.addRole(sysRole);
		return null;
	}
}
