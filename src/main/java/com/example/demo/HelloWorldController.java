package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("day")
public String helloWorld()
{
	return "hello";
}
@GetMapping("/hellow-world-bean")
public HelloWorldBean hellobean() {
	
	return new HelloWorldBean("hello world");
	
}
}
