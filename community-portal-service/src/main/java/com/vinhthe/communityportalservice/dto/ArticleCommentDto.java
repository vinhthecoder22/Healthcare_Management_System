package com.vinhthe.communityportalservice.dto;

import com.vinhthe.communityportalservice.enums.ArticleActorType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleCommentDto {
    private Long commentId;
    private Long articleId;
    private String actorId;
    private String actorName;
    private ArticleActorType actorType;
    private String content;
    private LocalDateTime createdAt;
    private boolean isActive;
}
