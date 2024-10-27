package com.example.tp.service.impl;

import com.example.tp.dto.PromotionDTO;
import com.example.tp.mapper.PromotionMapper;
import com.example.tp.model.Promotion;
import com.example.tp.repository.PromotionRepository;
import com.example.tp.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotionServiceImpl implements PromotionService {

    @Autowired
    private PromotionRepository promotionRepository;

    @Autowired
    private PromotionMapper promotionMapper;

    @Override
    public List<PromotionDTO> findAll() {
        return promotionMapper.toPromotionDto(promotionRepository.findAll());
    }

    @Override
    public void save(PromotionDTO promotionDTO) {
        Promotion promotion = promotionMapper.toEntity(promotionDTO);
        promotionRepository.save(promotion);
    }

    @Override
    public void update(PromotionDTO promotionDTO) {
        Promotion promotion = promotionRepository.findById((long) promotionDTO.getId()).orElse(null);
        if (promotion != null) {
            promotion = promotionMapper.update(promotionDTO, promotion);
            promotionRepository.save(promotion);
        }
    }

    @Override
    public void deleteById(Long id) {
        promotionRepository.deleteById(id);
    }


}
