package com.example.testing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@EntityScan(basePackages= "com.example.testing")
@SpringBootApplication

public class TestingApplication {


	public static void main(String[] args) {
		SpringApplication.run(TestingApplication.class, args);
		
	}

}

