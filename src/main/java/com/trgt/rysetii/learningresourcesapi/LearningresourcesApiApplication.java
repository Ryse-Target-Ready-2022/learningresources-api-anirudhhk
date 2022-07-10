package com.trgt.rysetii.learningresourcesapi;

import com.trgt.rysetii.learningresourcesapi.entity.LearningResource;
import com.trgt.rysetii.learningresourcesapi.entity.LearningResourceStatus;
import com.trgt.rysetii.learningresourcesapi.service.LearningResourceService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class LearningresourcesApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningresourcesApiApplication.class, args);
        LearningResourceService lrs = new LearningResourceService();
        LearningResource lr = lrs.createLearningResource(
                new String[]{"1", "Spring Boot Course", "599.0", "699.0", "LIVE", "03-08-2022", "04-10-2022",
                        "04-09-2022"});

        System.out.println(lr.getLearningResourceId() + "\t" + lr.getProductName());

    }

}
