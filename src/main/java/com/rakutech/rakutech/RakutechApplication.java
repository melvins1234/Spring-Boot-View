package com.rakutech.rakutech;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.rakutech.rakutech.entities.User;
import com.rakutech.rakutech.services.UserService;

@SpringBootApplication
//@ComponentScan(basePackages = { "com.rakutech.controller"} )
public class RakutechApplication {
	public static void main(String[] args) {
		SpringApplication.run(RakutechApplication.class, args);
	}

}
