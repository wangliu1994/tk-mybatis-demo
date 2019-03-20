package com.example.tkmybatisdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.example.tkmybatisdemo.mapper")
public class TkMybatisDemoApplication {
	private static Logger logger = LoggerFactory.getLogger(TkMybatisDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TkMybatisDemoApplication.class, args);
		logger.info("服务器启动成功");
	}

}

