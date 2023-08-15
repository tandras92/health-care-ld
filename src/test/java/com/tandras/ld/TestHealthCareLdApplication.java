package com.tandras.ld;

import com.tandras.ld.healthcare.HealthCareLdApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestHealthCareLdApplication {

	public static void main(String[] args) {
		SpringApplication.from(HealthCareLdApplication::main).with(TestHealthCareLdApplication.class).run(args);
	}

}
