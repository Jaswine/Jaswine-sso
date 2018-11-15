package com.jaswine.core;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages ={"com.jaswine.core.dao"} )
public class SsoCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsoCoreApplication.class, args);
	}
}
