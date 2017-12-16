package hello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableDiscoveryClient
@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@EnableScheduling
@ComponentScan({"ui.controller","hello"})
public class Application {

	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
 }
