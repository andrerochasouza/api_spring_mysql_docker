package br.com.totvs.apispring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "br.com.totvs.apispring")
@EntityScan(basePackages = "br.com.totvs.apispring.model")
public class ApiSpringApplication {

	public static void main(String[] args) { SpringApplication.run(ApiSpringApplication.class, args); }
}
