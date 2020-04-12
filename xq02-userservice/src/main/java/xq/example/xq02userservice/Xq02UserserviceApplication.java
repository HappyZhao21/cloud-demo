package xq.example.xq02userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class Xq02UserserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Xq02UserserviceApplication.class, args);
    }

}
