package com.game.springboot.basics.springbootlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootlearningApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringbootlearningApplication.class, args);
		/*for (String beans : applicationContext.getBeanDefinitionNames()) {
			System.out.println(beans+"\t");
		}*/
	}

}
