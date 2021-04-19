package org.ripple.wave.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.ripple.wave")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
