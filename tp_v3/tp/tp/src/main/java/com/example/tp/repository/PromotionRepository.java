package com.example.tp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.tp.model.Promotion;
import org.springframework.stereotype.Repository;

@Repository

public interface PromotionRepository extends JpaRepository<Promotion, Long> {
}
