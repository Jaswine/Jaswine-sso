package com.jaswine.core.entity;

/**
 * 系统角色
 * @author Jaswine
 */
public class SysRole {

  private String id;
  private String roleName;
  private String parentId;
  private String isEnacle;
  private java.sql.Timestamp createTime;
  private String description;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public String getIsEnacle() {
    return isEnacle;
  }

  public void setIsEnacle(String isEnacle) {
    this.isEnacle = isEnacle;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
