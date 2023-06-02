package com.yasinsolak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Bu sınıfın bir spring boot uygulamsına ait olduğunu ve gerekli olan bağımlılıkların
 * buradan itibaren tarandığı belirtiliyor.
 */

@SpringBootApplication
public class Java8startApplication {

	public static void main(String[] args) {
		SpringApplication.run(Java8startApplication.class, args);
	}

}
