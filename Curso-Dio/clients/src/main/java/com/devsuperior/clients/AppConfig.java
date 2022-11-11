package com.devsuperior.clients;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Livro getLivro() {
		return new Livro();
	}
	// <Bean id="livro" class="com.springbeans.Livro"/>
	
	@Bean 
	public AutorLivro getAutorLivro() {
		return new Autor();
	}
	// 
}
