package com.trgt.rysetii.learningresourcesapi.repository;

import com.trgt.rysetii.learningresourcesapi.entity.LearningResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LearningResourceRepository extends JpaRepository<LearningResource, Integer> {
}
