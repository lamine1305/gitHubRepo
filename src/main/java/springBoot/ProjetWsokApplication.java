package springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"controller","service"})
public class ProjetWsokApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetWsokApplication.class, args);
	}

}

