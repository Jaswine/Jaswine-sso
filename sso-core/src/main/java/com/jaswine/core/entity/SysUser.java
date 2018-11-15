package com.jaswine.core.entity;


import lombok.Data;

/**
 * 系统用户
 * @author Jaswine
 */
@Data
public class SysUser {

  private String id;
  private String userName;
  private String password;
  private String nickName;
  private String tel;
  private String email;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp lastLoginTime;
  private long count;
  private String isEnable;

}
