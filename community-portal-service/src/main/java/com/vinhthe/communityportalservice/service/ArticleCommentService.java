package com.vinhthe.communityportalservice.service;

import com.vinhthe.communityportalservice.dto.ArticleCommentDto;
import com.vinhthe.communityportalservice.exception.CustomException;

import java.util.List;

public interface ArticleCommentService {

    ArticleCommentDto createComment(ArticleCommentDto commentDto) throws CustomException;

    List<ArticleCommentDto> getCommentsByArticle(Long articleId) throws CustomException;

    void deleteComment(Long commentId) throws CustomException;
}
