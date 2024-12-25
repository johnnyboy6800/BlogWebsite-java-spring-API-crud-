package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication(scanBasePackages = "application")
public  class  BlogApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(BlogApiApplication.class, args);

	}



}
