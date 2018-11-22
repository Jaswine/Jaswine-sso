package com.jaswine.core.bean;


/**
 * Application信息
 * @author Jaswine
 */
public class SysApp {

  private String id;
  private String appName;
  private String appUrl;
  private String isEnable;
  private String appDescription;
  private java.sql.Timestamp createTime;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }


  public String getAppUrl() {
    return appUrl;
  }

  public void setAppUrl(String appUrl) {
    this.appUrl = appUrl;
  }


  public String getIsEnable() {
    return isEnable;
  }

  public void setIsEnable(String isEnable) {
    this.isEnable = isEnable;
  }


  public String getAppDescription() {
    return appDescription;
  }

  public void setAppDescription(String appDescription) {
    this.appDescription = appDescription;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }

}
