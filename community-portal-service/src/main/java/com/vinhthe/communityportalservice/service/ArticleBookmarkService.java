package com.vinhthe.communityportalservice.service;

import com.vinhthe.communityportalservice.dto.ArticleDto;
import com.vinhthe.communityportalservice.exception.CustomException;

import java.util.List;

public interface ArticleBookmarkService {

    boolean toggleBookmark(Long articleId) throws CustomException;

    List<ArticleDto> getBookmarkedArticles() throws CustomException;

    boolean isBookmarkedByCurrentActor(Long articleId) throws CustomException;
}
