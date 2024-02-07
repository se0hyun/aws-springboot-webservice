package com.springbootaws.book.awsspringbootwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication	// 해당 애노테이션으로 스프링 부트의 자동 설정, 스프링 빈 읽기와 생성이 모두 자동으로 설정됨
public class AwsSpringbootWebserviceApplication {	// main class

	public static void main(String[] args) {
		SpringApplication.run(AwsSpringbootWebserviceApplication.class, args);
	}	// 내장 was 실행 -> 서버에 톰캣을 설치할 필요가 없고, JAR 파일로 실행 가능

}
