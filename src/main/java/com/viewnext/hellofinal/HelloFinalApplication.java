package com.viewnext.hellofinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloFinalApplication.class, args);
	}

	@GetMapping("/")
	public String bienvenida(){
		return "Bievenido a la aplicacion de Spring correspondiente a la practica final de Javier Amores";
	}

	@GetMapping("/suma")
	public @ResponseBody Float suma(@RequestParam(value = "a") Float a, @RequestParam(value = "b") Float b) {
		return a + b;
	}

	@GetMapping("/resta")
	public @ResponseBody Float resta(@RequestParam(value = "a") Float a, @RequestParam(value = "b") Float b) {
		return a - b;
	}

	@GetMapping("/multiplicacion")
	public @ResponseBody Float multiplicacion(@RequestParam(value = "a") Float a, @RequestParam(value = "b") Float b) {
		return a * b;
	}

	@GetMapping("/division")
	public @ResponseBody Float division(@RequestParam(value = "a") Float a, @RequestParam(value = "b") Float b) {
		return a / b;
	}
}
