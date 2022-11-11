package com.devsuperior.clients;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.ApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Livro livro = factory.getBean(Livro.class);
		livro.setNome("Watchmen");
		livro.setCodigo("D3D4");
		
		Autor autor = factory.getBean(Autor.class);
		autor.setNome("Alan Moore");
		
		livro.exibir();
		((AbstractApplicationContext) factory).close();
	}

}
