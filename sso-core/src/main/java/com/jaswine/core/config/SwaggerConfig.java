package com.jaswine.core.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger-API配置
 * @author Jaswine
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {


	private static final Logger LOGGER = LoggerFactory.getLogger(SwaggerConfig.class);


	/**
	 * 创建API
	 * @return API
	 */
	@Bean
	public Docket createRestApi(){
		LOGGER.info("[SwaggerConfig]==创建API");
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build();
	}


	/**
	 * API创建信息
	 * @return API创建信息
	 */
	@Bean
	public ApiInfo apiInfo(){
		LOGGER.info("[SwaggerConfig]==API创建者附属信息");
		return new ApiInfoBuilder()
				.title("RESTful APIs")
				.description("Jaswine")
				.termsOfServiceUrl("http://www.jaswine.club")
//				.contact("Jaswine")
				.version("1.0")
				.build();
	}

}
