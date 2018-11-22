package com.jaswine.core.service.impl;

import com.jaswine.beans.dto.BaseDto;
import com.jaswine.beans.dto.Dto;
import com.jaswine.core.bean.SysUser;
import com.jaswine.core.dao.SysUserDao;
import com.jaswine.core.enums.ResultEnum;
import com.jaswine.core.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


/**
 * User相关Service
 * @author Jasmine
 */
@Service
@Slf4j
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	private SysUserDao sysUserDao;

	/**
	 * 新增用户
	 * @param sysUser 用户
	 * @return dto
	 */
	@Override
	public Dto addUser(SysUser sysUser) {
		Dto dto = new BaseDto();

		if (sysUserDao.getUserByUsername(sysUser.getUserName()) != null){
			log.info("[SysUserServiceImpl]"+ResultEnum.UserExist.toString());
			dto.setStatus(ResultEnum.UserExist.getCode());
			dto.setMsg(ResultEnum.UserExist.getMsg());
		}else {
			sysUser.setPassword(new BCryptPasswordEncoder().encode(sysUser.getPassword()));
			if (sysUserDao.addUser(sysUser) > 0){
				dto.setStatus(ResultEnum.SUCCESS.getCode());
				dto.setMsg(ResultEnum.SUCCESS.getMsg());
				dto.setData(sysUser);
			}else {
				dto.setStatus(900);
				dto.setMsg("ERROR");
			}
		}
		return dto;
	}

	/**
	 * 根据用户名查询用户信息
	 * @param s 用户名
	 * @return 用户信息
	 */
	@Override
	public SysUser getUserByUsername(String s) throws NullPointerException {
		log.info("[SysUserServiceImpl]根据用户名查询用户信息");
		return sysUserDao.getUserByUsername(s);
	}


}
