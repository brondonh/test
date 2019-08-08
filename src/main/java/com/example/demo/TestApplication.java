package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(TestApplication.class, args);
	}
	
	@RequestMapping("main")
	public String saludar()
	{
		return "Hola mundo";
	}
	
	
	@RequestMapping("caminar")
	public String endPoint2()
	{
		return "Este es el segundo endpoint";
	}
	
	@RequestMapping("correr")
	public String endPoint3()
	{
		return "Este es el tercer endpoint";
	}
}
