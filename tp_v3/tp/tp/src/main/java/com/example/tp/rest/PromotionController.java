package com.example.tp.rest;

import com.example.tp.dto.PromotionDTO;
import com.example.tp.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/promotion")
@RestController
public class PromotionController {

    @Autowired
    PromotionService promotionService;

    @GetMapping(path = "/getall")
    public List<PromotionDTO> getAll(){
        return promotionService.findAll();
    }

    @PutMapping(path = "/addPromotion")
    void addPromotion(@RequestBody PromotionDTO promotionDTO){
        promotionService.save(promotionDTO);
    }

    @PatchMapping(path = "/modifyPromotion")
    void modifyPromotion(@RequestBody PromotionDTO promotionDTO){
        promotionService.update(promotionDTO);
    }

    @DeleteMapping(path = "/deletePromotion/{id}")
    void deletePromotion(@PathVariable Long id){
        promotionService.deleteById(id);
    }



}
