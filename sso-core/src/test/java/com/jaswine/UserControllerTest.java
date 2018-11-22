package com.jaswine;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jaswine.core.SsoCoreApplication;
import com.jaswine.core.bean.SysUser;
import com.jaswine.util.uuid.UUIDUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * UserController单元测试
 * @author Jaswine
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SsoCoreApplication.class)
@Slf4j
public class UserControllerTest {


	/**
	 * 伪造的web环境
	 */
	@Autowired
	private WebApplicationContext wac;

	/**
	 * 伪造的mock
	 */
	private MockMvc mockMvc;

	/**
	 * 创建web环境
	 */
	@Before
	public void setContext() {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}

	/**
	 * 测试新增用户
	 */
	@Test
	public void whenAddUserSuccess() throws Exception {

		ObjectMapper mapper = new ObjectMapper();

		SysUser sysUser = new SysUser();
		sysUser.setId(UUIDUtil.generateUUID());
		sysUser.setUserName("admin");
		sysUser.setPassword("000000");
		sysUser.setNickName("超级用户");
		sysUser.setTel("17621181642");
		sysUser.setEmail("yuanzhi_wang@163.com");

		String content = mapper.writeValueAsString(sysUser);
		String result = mockMvc.perform(post("/sysuser/")
				.content(content)
				.contentType(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.status").value(0))
				.andReturn().getResponse().getContentAsString();
		log.info("[UserControllerTest]测试新增用户成功,结果:{"+result+"}");
	}


	/**
	 * 测试用户登录
	 */
	@Test
	public void whenLoginSuccess() throws Exception {
		log.info("[UserControllerTest]测试用户登录成功");
		mockMvc.perform(post("/user/login")
				.param("username", "jasmine")
				.param("password", "jasmine")
				.contentType(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.status").value(0));
	}



	/**
	 * 测试通过用户名获取用户信息
	 *
	 * @throws Exception 异常
	 */
	@Test
	public void whenGetUserInfoByUsernameSuccess() throws Exception {
		log.info("Start-->测试获得用户信息成功");
		mockMvc.perform(get("/getUserInfo/Jaswine1")
				.contentType(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.status").value(0))
				.andExpect(jsonPath("$.data.length()").value(1));
	}

	/**
	 * 测试通过是否审核获取用户信息
	 *
	 * @throws Exception 异常
	 */
	@Test
	public void whenGetUserInfoByIscheckSuccess() throws Exception {
		String result = mockMvc.perform(get("/getUserInfo/1")
				.contentType(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.status").value(0))
				.andExpect(jsonPath("$.data.length()").isArray())
				.andReturn().getResponse().getContentAsString();

		System.out.println(result);
	}


	/**
	 * 文件上传
	 *
	 * @throws Exception 异常
	 */
	@Test
	public void whenUploadFileSuccess() throws Exception {
		mockMvc.perform(multipart("/file")
				.file(new MockMultipartFile("file", "test.txt", "multipart/form-data", "hello,jaswine".getBytes("UTF-8"))))
				.andExpect(status().isOk());
	}
}
