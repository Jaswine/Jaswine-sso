package com.jaswine.core.dao;


import com.jaswine.core.bean.SysUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * 用户dao
 *
 * @author Jaswine
 */
@Repository
public interface SysUserDao {

	SysUser getUserByUsername(String username);

	/**
	 * 新增用户
	 * @param sysUser 用户
	 * @return 插入个数
	 */
	int addUser(SysUser sysUser);
}
