package com.vinhthe.cdssservice.service;

import com.vinhthe.cdssservice.dto.HealthRecommendationDto;
import com.vinhthe.cdssservice.exception.CustomException;

import java.util.List;

public interface CdssService {
    // String getResponseFromOpenAi(String prompt) throws CustomException;
    String generateHealthRecommendation() throws CustomException;

    List<HealthRecommendationDto> getAllHealthRecommendations() throws CustomException;

    HealthRecommendationDto getHealthRecommendationById(Long id) throws CustomException;

    List<HealthRecommendationDto> getHealthRecommendationByPatientId(String patientId) throws CustomException;

}
