package com.bharat.docker.SampleSpringBootDocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@RequestMapping("/users")
public class SampleSpringBootDockerApplication {

	@GetMapping("")
	public String getUser() {
		return "Hello World";
	}

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringBootDockerApplication.class, args);
	}

}
