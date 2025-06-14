package py.com.pgimenez.spring_hexarch_lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringHexarchLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHexarchLabApplication.class, args);
	}

}
