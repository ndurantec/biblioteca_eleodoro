package com.eleodoro.biblioteca_eleodoro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BibliotecaEleodoroApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaEleodoroApplication.class, args);
	}

}
