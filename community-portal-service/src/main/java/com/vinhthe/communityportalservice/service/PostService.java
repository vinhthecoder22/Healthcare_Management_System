package com.vinhthe.communityportalservice.service;

import com.vinhthe.communityportalservice.dto.PostDto;
import com.vinhthe.communityportalservice.dto.UploadFileResponseDto;
import com.vinhthe.communityportalservice.exception.CustomException;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface PostService {
    void createPost(PostDto postDto) throws CustomException;

    PostDto getPostById(Long postId) throws CustomException;

    List<PostDto> getAllPosts() throws CustomException;

    void updatePost(PostDto postDto) throws CustomException;

    void deletePost(Long postId) throws CustomException;

    UploadFileResponseDto upload(MultipartFile file) throws CustomException;
}
