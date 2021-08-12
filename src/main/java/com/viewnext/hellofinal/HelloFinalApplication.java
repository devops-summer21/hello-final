package com.viewnext.hellofinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class HelloFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloFinalApplication.class, args);
	}

	@GetMapping("/")
	public String bienvenida(){
		return "Bievenido a la aplicacion de Spring correspondiente a la practica final de Javier Amores";
	}
}
