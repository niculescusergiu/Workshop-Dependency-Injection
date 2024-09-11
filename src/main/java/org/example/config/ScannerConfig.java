package org.example.config;

import org.example.util.ScannerInputService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ScannerConfig {
    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }
}
