package com.example.tp.mapper;

import com.example.tp.dto.PromotionDTO;
import com.example.tp.model.Promotion;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PromotionMapper {

    public Promotion toEntity(PromotionDTO promotionDTO){
        return new Promotion(
                promotionDTO.getId(),
                promotionDTO.getName(),
                promotionDTO.getDescription()
        );
    }

    public PromotionDTO toDTO(Promotion promotion) {
        return new PromotionDTO(
                promotion.getId(),
                promotion.getName(),
                promotion.getDescription()
        );
    }

    public List<Promotion> toPromotionEntity(List<PromotionDTO> listPromotionDto){
        return listPromotionDto.stream().map(this::toEntity).collect(Collectors.toList());
    }

    public List<PromotionDTO> toPromotionDto(List<Promotion> listPromotion){
        return listPromotion.stream().map(this::toDTO).collect(Collectors.toList());
    }

    public Promotion update(PromotionDTO promotionDTO, Promotion promotion){
        promotion.setName(promotionDTO.getName());
        promotion.setDescription(promotionDTO.getDescription());
        return promotion;
    }
}
