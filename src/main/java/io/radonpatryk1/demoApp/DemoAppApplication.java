package io.radonpatryk1.demoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAppApplication.class, args);

		int n = rekurencja(5);

		System.out.println(n);
	}



	@Bean
	Validator validator() {
		return new LocalValidatorFactoryBean();
	}

	public static int rekurencja (int i) {

		int result = 0;
		for (int j = 0; j < i+1; j++) {
			result = result + i;
		}
		return result;
	}

}
