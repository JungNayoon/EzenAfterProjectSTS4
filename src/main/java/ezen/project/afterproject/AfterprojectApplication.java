package ezen.project.afterproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class AfterprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AfterprojectApplication.class, args);
		
		log.info("실행성공");

		System.out.println("123");

	}

}
