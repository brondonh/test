package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestApplication2
{
	public static void main(String[] args)
	{
		SpringApplication.run(TestApplication.class, args);
	}
	
	
	public String saludar()
	{
		return "Hola mundo";
	}
	
	@RequestMapping("ejecutar")
	public String endPoint1()
	{
		return "Este es el primer endpoint";
	}
}
