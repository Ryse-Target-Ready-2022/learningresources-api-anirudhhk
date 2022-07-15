package com.trgt.rysetii.learningresourcesapi;

import com.trgt.rysetii.learningresourcesapi.entity.LearningResource;
import com.trgt.rysetii.learningresourcesapi.entity.LearningResourceStatus;
import com.trgt.rysetii.learningresourcesapi.repository.LearningResourceRepository;
import com.trgt.rysetii.learningresourcesapi.service.LearningResourceService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.trgt.rysetii.learningresourcesapi.entity.LearningResourceStatus.LIVE;

@SpringBootApplication
public class LearningresourcesApiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(LearningresourcesApiApplication.class, args);

        LearningResource lr0 = new LearningResource(1319, "Spring Boot Course",
                599.0, 699.0, LIVE, LocalDate.of(2022, 02, 13),
                LocalDate.of(2022, 05, 17), LocalDate.of(2022, 04, 22));

        LearningResource lr1 = new LearningResource(1320, "Django Course",
                699.0, 799.0, LIVE, LocalDate.of(2022, 07, 14),
                LocalDate.of(2022,  10, 02), LocalDate.of(2022, 9, 25));

        List<LearningResource> learninglist = new ArrayList<>();
        learninglist.add(lr0);
        learninglist.add(lr1);

        LearningResourceService lrs = context.getBean(LearningResourceService.class);

        // Calling saveLearningResources method
        lrs.saveLearningResources(learninglist);

        // Checking if the data is successfully stored in the database
        printResources(lrs.getLearningResources());
    }

    private static void printResources(List<LearningResource> learninglist) {
        for (LearningResource learningresource : learninglist) {
            System.out.println(learningresource.getLearningResourceId() + "\t" + learningresource.getProductName() + "\tRs. " + learningresource.getCostPrice());
        }
    }
}