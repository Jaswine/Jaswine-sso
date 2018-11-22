package com.jaswine.core.bean;


/**
 * 系统功能
 * @author Jaswine
 */
public class SysRight {

  private String id;
  private String parentId;
  private String rightName;
  private java.sql.Timestamp createTime;
  private String description;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public String getRightName() {
    return rightName;
  }

  public void setRightName(String rightName) {
    this.rightName = rightName;
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
