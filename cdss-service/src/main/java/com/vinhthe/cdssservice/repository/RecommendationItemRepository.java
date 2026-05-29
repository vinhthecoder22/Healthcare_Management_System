package com.vinhthe.cdssservice.repository;

import com.vinhthe.cdssservice.entity.RecommendationItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecommendationItemRepository extends JpaRepository<RecommendationItem, Long> {
}
