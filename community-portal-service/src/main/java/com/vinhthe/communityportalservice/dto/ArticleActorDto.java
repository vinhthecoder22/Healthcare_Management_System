package com.vinhthe.communityportalservice.dto;

import com.vinhthe.communityportalservice.enums.ArticleActorType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleActorDto {
    private String actorId;
    private String actorName;
    private ArticleActorType actorType;
}
