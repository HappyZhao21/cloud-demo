package xq.example.xq04eureka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Xq04EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Xq04EurekaApplication.class, args);
    }

}
