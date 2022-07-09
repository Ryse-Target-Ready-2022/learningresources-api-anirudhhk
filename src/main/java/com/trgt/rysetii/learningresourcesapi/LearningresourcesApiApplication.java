package com.trgt.rysetii.learningresourcesapi;

import com.trgt.rysetii.learningresourcesapi.entity.LearningResource;
import com.trgt.rysetii.learningresourcesapi.entity.LearningResourceStatus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class LearningresourcesApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningresourcesApiApplication.class, args);
        LearningResource lr = new LearningResource(1, "Spring Boot Course", 599.0, 699.0,
                LearningResourceStatus.LIVE,
                LocalDate.of(2022, 8, 3),
                LocalDate.of(2022, 10, 4),
                LocalDate.of(2022, 9, 4));

        System.out.println(lr.getProductName());
    }

}
