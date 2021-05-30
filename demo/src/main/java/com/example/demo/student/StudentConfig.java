package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean // CommandLineRunner is an interface used to indicate that a bean
        // should run when it is contained within a SpringApplication.
    // After starting the server, this bit of code was run without being
    // wired elsewhere. Maybe this is what a bean does.
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student pedro = new Student(
                        "Pedro",
                        "pgdneto@gmail.com",
//                        28,
                        LocalDate.of(1993, Month.FEBRUARY, 19)
                );
            Student amanda = new Student(
                    "Amanda",
                    "amanda_flavia12@gmail.com",
//                    26,
                    LocalDate.of(1994, Month.OCTOBER, 16)
            );

            studentRepository.saveAll(
                    List.of(pedro, amanda)
            );
        };
    }
}
