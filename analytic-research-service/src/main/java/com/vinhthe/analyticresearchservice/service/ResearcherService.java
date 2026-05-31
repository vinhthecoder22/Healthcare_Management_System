package com.vinhthe.analyticresearchservice.service;

import com.vinhthe.analyticresearchservice.dto.ResearcherDto;
import com.vinhthe.analyticresearchservice.exception.CustomException;

import java.util.List;

public interface ResearcherService {
    void registerResearcher(ResearcherDto researcherDto) throws CustomException;

    List<ResearcherDto> getAllResearchers() throws CustomException;

    List<ResearcherDto> getAllValidResearchers() throws CustomException;

    List<ResearcherDto> getAllTakenResearchers() throws CustomException;

    void healthDataToCsv(Long id, String fileName) throws CustomException;

    void giveAccessToResearcher(Long id) throws CustomException;
}
