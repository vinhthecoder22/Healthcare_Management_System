package com.vinhthe.cdssservice.repository;

import com.vinhthe.cdssservice.entity.HealthRecommendationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HealthRecommendationRepository extends JpaRepository<HealthRecommendationEntity, Long> {
    List<HealthRecommendationEntity> findAllByPatientId(String patientId);
}
