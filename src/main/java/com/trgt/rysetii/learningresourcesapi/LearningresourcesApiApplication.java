package com.trgt.rysetii.learningresourcesapi;

import com.trgt.rysetii.learningresourcesapi.entity.LearningResource;
import com.trgt.rysetii.learningresourcesapi.service.LearningResourceService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class LearningresourcesApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningresourcesApiApplication.class, args);
        LearningResourceService lrs = new LearningResourceService();

        LearningResource lr0 = lrs.createLearningResource(
                new String[]{"1", "Spring Boot Course", "599.0", "699.0", "LIVE", "03-08-2022", "04-10-2022",
                        "04-09-2022"});

        LearningResource lr1 = lrs.createLearningResource(
                new String[]{"2", "Django Course", "499.0", "699.0", "PLANNING", "13-09-2022", "12-12-2022",
                        "17-01-2023"});

        List<LearningResource> learninglist = new ArrayList<>();
        learninglist.add(lr0);
        learninglist.add(lr1);

        lrs.saveLearningResources(learninglist);

        List<LearningResource> returnedLearninglist = lrs.getLearningResources();
        List<Double> profitMarginList = lrs.getProfitMargin();
        List<LearningResource> sortedList = lrs.sortLearningResourcesByProfitMargin(returnedLearninglist);
        System.out.println(profitMarginList);
        printResources(returnedLearninglist);
        printResources(sortedList);

    }

    private static void printResources(List<LearningResource> learninglist) {
        for (LearningResource learningresource : learninglist) {
            System.out.println(learningresource.getLearningResourceId() + "\t" + learningresource.getProductName()
                    + "\tRs. " + learningresource.getCostPrice());
        }
    }

}
