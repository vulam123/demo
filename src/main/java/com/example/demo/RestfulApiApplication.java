package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.User;

@SpringBootApplication
public class RestfulApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulApiApplication.class, args);
	}

}
