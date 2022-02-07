package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.controller.UserController;
import com.example.entity.Users;
import com.example.repository.UserRepository;
import com.example.service.UserService;
import com.exapmle.service.impl.UserServiceImpl;
@SpringBootApplication(scanBasePackageClasses = {UserController.class, UserService.class, UserServiceImpl.class,Users.class, UserRepository.class})
public class GradlexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradlexampleApplication.class, args);
	}

}



