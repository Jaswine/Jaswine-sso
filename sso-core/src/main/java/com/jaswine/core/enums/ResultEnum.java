package com.jaswine.core.enums;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 返回结果
 *
 * @author Jaswine
 */
@ToString
public enum ResultEnum {

	/**
	 * 请求成功
	 */
	SUCCESS(200,"SUCCESS"),
	/**
	 * 用户已存在
	 */
	UserExist(700,"用户已存在");

	/**
	 * 状态码
	 */
	@Getter
	private int code;
	/**
	 * 状态信息
	 */
	@Getter
	private String msg;

	ResultEnum(int code,String msg){
		this.code = code;
		this.msg = msg;
	}
}
