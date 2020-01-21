package org.zkoss.zkangular8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Zkangular8Application {

	public static void main(String[] args) {
		SpringApplication.run(Zkangular8Application.class, args);
	}

}
