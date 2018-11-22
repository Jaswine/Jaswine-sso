package com.jaswine.core.dao;

import com.jaswine.core.bean.SysRole;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 角色Dao
 *
 * @author Jasmine
 */
@Repository
public interface SysRoleDao {
	int addRole(SysRole sysRole);

	int delRole(String id);

	int updateRole(SysRole sysRole);

	List<SysRole> getRoles();
}
