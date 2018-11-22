package com.jaswine.core.controller;


import com.jaswine.beans.dto.BaseDto;
import com.jaswine.beans.dto.Dto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * 系统应用相关操作Controller
 * @author Jasmine
 */
@RestController
@RequestMapping("/sysapp/")
@Slf4j
@Api(value = "应用API", basePath = "/sysapp/")
public class SysAppController {


	@PostMapping
	@ApiOperation(value = "新增App信息")
	public Dto addAppInfo(){
		Dto dto = new BaseDto();
		dto.setStatus(200);
		dto.setMsg("OK");
		return dto;
	}

	@DeleteMapping
	@ApiOperation(value = "删除app信息")
	public Dto delAppInfo(){
		Dto dto = new BaseDto();
		dto.setStatus(200);
		dto.setMsg("OK");
		return dto;
	}

	@PutMapping
	@ApiOperation(value = "更新app信息")
	public Dto updateAppInfo(){
		Dto dto = new BaseDto();
		dto.setStatus(200);
		dto.setMsg("OK");
		return dto;
	}

	@GetMapping()
	@ApiOperation(value = "获得所有的app信息")
	public Dto getAppinfo(){
		Dto dto = new BaseDto();
		dto.setStatus(200);
		dto.setMsg("OK");
		return dto;
	}

	@GetMapping("{id}")
	@ApiOperation(value = "根据Id查询App信息")
	public Dto getAppInfoById(){
		Dto dto = new BaseDto();
		dto.setStatus(200);
		dto.setMsg("OK");
		return dto;
	}
}
