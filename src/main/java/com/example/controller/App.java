package com.example.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/test")
public class App {

	/**
	 * 字符串方式
	 * @param id
	 * @return
	 */
	@RequestMapping("/{id}")
	public String home(@PathVariable("id") int id) {
		return "Hello" + id;
	}

	/*public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}*/
}