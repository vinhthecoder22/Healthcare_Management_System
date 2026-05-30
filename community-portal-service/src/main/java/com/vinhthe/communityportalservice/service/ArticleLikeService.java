package com.vinhthe.communityportalservice.service;

import com.vinhthe.communityportalservice.exception.CustomException;

public interface ArticleLikeService {

    boolean toggleLike(Long articleId) throws CustomException;

    long getLikeCount(Long articleId) throws CustomException;

    boolean isLikedByCurrentActor(Long articleId) throws CustomException;
}
