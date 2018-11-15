package com.jaswine.core.controller;


import com.jaswine.dto.BaseDto;
import com.jaswine.dto.Dto;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 系统应用相关操作Controller
 * @author Jasmine
 */
@RestController
@RequestMapping("/sysapp")
public class SysAppController {

	private static final Logger LOGGER = LoggerFactory.getLogger(SysAppController.class);

	@GetMapping()
	@ApiOperation(value = "获得所有的app信息")
	public Dto getAppinfoById(){
		Dto dto = new BaseDto();
		dto.setStatus(200);
		dto.setMsg("OK");
		return dto;
	}



}
