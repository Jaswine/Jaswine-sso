package com.jaswine;


import com.jaswine.core.SsoCoreApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SsoCoreApplication.class)
public class AppControllerTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(AppControllerTest.class);

	/**
	 * 伪造的web环境
	 */
	@Autowired
	private WebApplicationContext wac;

	@Autowired
	private RedisTemplate redisTemplate;

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


	@Test
	public void whenGetAppInfoSuccess() throws Exception {
		String string = mockMvc.perform(MockMvcRequestBuilders.get("/sysapp")
				.contentType(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andReturn().getResponse().getContentAsString();
		LOGGER.info("结果:" + string);
		redisTemplate.opsForValue().set("jasmine","wang");
		LOGGER.info(redisTemplate.opsForValue().get("jasmine").toString());
	}


}
