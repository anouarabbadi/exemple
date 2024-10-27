package com.example.tp.service;
import java.util.List;
import com.example.tp.dto.PromotionDTO;

import com.example.tp.model.Promotion;

public interface PromotionService {
    List<PromotionDTO> findAll();
    void save(PromotionDTO promotionDTO);
    void update(PromotionDTO promotionDTO);
    void deleteById(Long id);
}
