package com.jaswine.core.bean;


import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import java.util.Set;

/**
 * 系统用户entity
 *
 * <p>
 *     实现SprngSecurity的用户规范
 * </p>
 *
 * @author Jaswine
 */
@Data
public class SysUser {

  /**
   * id
   */
  private String id;
  /**
   * 用户名
   */

  private String userName;
  /**
   * 密码
   */
  private String password;
  /**
   * 昵称
   */
  private String nickName;
  /**
   * 电话
   */
  private String tel;
  /**
   * 邮箱
   */
  private String email;
  /**
   * 创建时间
   */
  private java.sql.Timestamp createTime;
  /**
   * 最后登录时间
   */
  private java.sql.Timestamp lastLoginTime;
  /**
   * 登录次数
   */
  private long count;
  /**
   * 是否可用
   */
  private String isEnable;
  /**
   * 权限集合
   */
  private Set<? extends GrantedAuthority> authorities;

}
