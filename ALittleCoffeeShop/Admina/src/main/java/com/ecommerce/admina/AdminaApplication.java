package com.ecommerce.admina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.ecommerce.library.*","com.ecommerce.admina.*"})
@EnableJpaRepositories(value = "com.ecommerce.library.repository")
@EntityScan(value = "com.ecommerce.library.model")
public class AdminaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminaApplication.class, args);
    }

}
