package com.vinhthe.cdssservice.service;

import com.vinhthe.cdssservice.dto.RecommendationCreateDto;
import com.vinhthe.cdssservice.dto.RecommendationDto;
import com.vinhthe.cdssservice.exception.CustomException;
import org.springframework.http.HttpStatusCode;

import java.util.List;

public interface HealthCareService {
    RecommendationDto create(RecommendationCreateDto recommendationDto) throws CustomException;

    List<RecommendationDto> getByPatient() throws CustomException;

    List<RecommendationDto> getByDoctor() throws CustomException;

    RecommendationDto updateByDoctor(Long recommendationId, RecommendationCreateDto recommendationDto)
            throws CustomException;

    void deleteIdByDoctor(Long recommendationId) throws CustomException;

    RecommendationDto getById(Long recommendationId) throws CustomException;
}
