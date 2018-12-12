package awin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
//https://www.logicbig.com/tutorials/spring-framework/spring-webflux/web-client.html
public class ExampleApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ExampleApplication.class);
    }
}
