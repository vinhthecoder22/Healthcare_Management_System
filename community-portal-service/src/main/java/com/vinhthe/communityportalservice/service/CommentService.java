package com.vinhthe.communityportalservice.service;

import com.vinhthe.communityportalservice.dto.CommentDto;
import com.vinhthe.communityportalservice.exception.CustomException;

import java.util.List;

public interface CommentService {
    void createComment(CommentDto commentDto) throws CustomException;

    void updateComment(CommentDto commentDto) throws CustomException;

    void deleteComment(Long commentId) throws CustomException;

    CommentDto getCommentById(Long commentId) throws CustomException;

    List<CommentDto> getAllCommentsByPostId(Long postId) throws CustomException;
}
