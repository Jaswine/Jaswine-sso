package com.jaswine.core.bean;

import lombok.Data;

/**
 * 系统角色
 * @author Jaswine
 */
@Data
public class SysRole {

  /**
   * id
   */
  private String id;
  /**
   * 角色名
   */
  private String roleName;
  /**
   * 父角色id
   */
  private String parentId;
  /**
   * 是否可用
   * 0:不可用;
   * 1:可用
   */
  private String enable;
  /**
   * 创建时间
   */
  private java.sql.Timestamp createTime;
  /**
   * 描述
   */
  private String description;

}
