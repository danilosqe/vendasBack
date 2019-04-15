package com.vendas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/teste")
@RestController
public class TesteController {
	@GetMapping
	public String getTeste() {
		return "Teste OK";
	}
}
