package xq.example.xq01service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Xq01ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Xq01ServiceApplication.class, args);
    }

}
