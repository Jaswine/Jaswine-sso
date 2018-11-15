package com.jaswine.core.entity;


/**
 * 系统用户和角色关系
 * @author Jaswine
 */
public class SysUserRole {

  private String userId;
  private String roleId;


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }

}
