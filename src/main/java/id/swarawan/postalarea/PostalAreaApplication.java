package id.swarawan.postalarea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("id.investree.core")
public class PostalAreaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostalAreaApplication.class, args);
	}

}
