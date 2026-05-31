package com.vinhthe.communityportalservice.service;

import com.vinhthe.communityportalservice.dto.ArticleDto;
import com.vinhthe.communityportalservice.enums.ArticleCategory;
import com.vinhthe.communityportalservice.exception.CustomException;

import java.util.List;

public interface ArticleService {

    ArticleDto createArticle(ArticleDto articleDto) throws CustomException;

    ArticleDto updateArticle(ArticleDto articleDto) throws CustomException;

    void deleteArticle(Long articleId) throws CustomException;

    ArticleDto getArticleById(Long articleId) throws CustomException;

    List<ArticleDto> getAllArticles() throws CustomException;

    List<ArticleDto> getArticlesByCategory(ArticleCategory category) throws CustomException;

    List<ArticleDto> getArticlesByDoctor(String doctorId) throws CustomException;

    List<ArticleDto> searchArticles(String keyword) throws CustomException;
}
