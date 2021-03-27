package ab.techstack.spring.activitiservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ActivitiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActivitiServiceApplication.class, args);
	}

}
