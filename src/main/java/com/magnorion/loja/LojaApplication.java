package com.magnorion.loja;

import com.magnorion.loja.tests.BebidaTest;
import com.magnorion.loja.tests.ComidaTest;
import com.magnorion.loja.tests.SobremesaTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LojaApplication {

	public static void main(String[] args) {
		BebidaTest.main(args);
		ComidaTest.main(args);
		SobremesaTest.main(args);

		SpringApplication.run(LojaApplication.class, args);
	}
}
