package com.jaswine.core.config;

import com.fasterxml.jackson.core.JsonEncoding;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

/**
 * 配置SpringMVC视图解析
 *
 * @author Jasmine
 */
@Configuration
public class WebMvcConfig {

	private Logger logger = LoggerFactory.getLogger(WebMvcConfig.class);

	/**
	 * 配置Json视图解析
	 *
	 * @return jsonView json视图对象
	 */
	@Bean
	public MappingJackson2JsonView jsonView() {
		logger.info("Start-->配置Json视图解析对象....");
		MappingJackson2JsonView jsonView = new MappingJackson2JsonView();
		// 设置编码
		jsonView.setEncoding(JsonEncoding.UTF8);

		jsonView.setExtractValueFromSingleKeyModel(true);
		// 设置HTTP头信息
		jsonView.setContentType("application/json;charset=UTF-8");
		return jsonView;
	}
}
