package xq.example.xq03orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class Xq03OrderserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Xq03OrderserviceApplication.class, args);
    }

}
