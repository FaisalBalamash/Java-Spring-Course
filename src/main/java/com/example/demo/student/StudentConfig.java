package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student faisal = new Student(
                    "Faisal",
                    LocalDate.of(2000, Month.JANUARY,5),
                    "Faisal@gmail.com"

            );
            Student saleh = new Student(
                    "saleh",
                    LocalDate.of(2012, Month.AUGUST,6),
                    "saleh@gmail.com"

            );

            repository.saveAll(List.of(faisal,saleh));
        };
    }
}
