package com.jaswine.core.entity;


/**
 * App-角色-功能关系
 * @author Jaswine
 */
public class SysAppRoleRight {

  private String appid;
  private String roleId;
  private String rightId;


  public String getAppid() {
    return appid;
  }

  public void setAppid(String appid) {
    this.appid = appid;
  }


  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }


  public String getRightId() {
    return rightId;
  }

  public void setRightId(String rightId) {
    this.rightId = rightId;
  }

}
