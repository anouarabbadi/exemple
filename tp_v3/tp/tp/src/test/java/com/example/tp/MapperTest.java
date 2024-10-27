package com.example.tp;

import com.example.tp.dto.CategoryDTO;
import com.example.tp.dto.PanierDTO;
import com.example.tp.dto.ProduitDTO;
import com.example.tp.dto.PromotionDTO;
import com.example.tp.mapper.CategoryMapper;
import com.example.tp.mapper.PanierMapper;
import com.example.tp.mapper.ProduitMapper;
import com.example.tp.mapper.PromotionMapper;
import com.example.tp.model.Category;
import com.example.tp.model.Panier;
import com.example.tp.model.Produit;
import com.example.tp.model.Promotion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MapperTest {

    @Test
    public void ProduitToDtoTest() {
        Produit p = new Produit(1, "pr1", "100", "200");
        ProduitDTO pdto = new ProduitMapper().toDTO(p);
        Assertions.assertEquals(p.getId(), pdto.getId());
        Assertions.assertEquals(p.getName(), pdto.getName());
        Assertions.assertEquals(p.getPrix_max(), pdto.getPrix_max());
        Assertions.assertEquals(p.getPrix_min(), pdto.getPrix_min());
    }

    @Test
    public void PanierToDtoTest() {
        List<Produit> produitList = new ArrayList<>();;
        Produit p = new Produit(1, "pr1", "100", "200");
        produitList.add(p);
        Panier panier = new Panier(1, produitList);
        PanierDTO panierDTO = new PanierMapper().toDTO(panier);
        Assertions.assertEquals(panier.getId(), panierDTO.getId());
        Assertions.assertEquals(panier.getProduits().get(0).getId(), panierDTO.getProduits().get(0).getId());
    }
    @Test
    public void CategoryToDtoTest() {
        List<Produit> produitList = new ArrayList<>();
        Produit p = new Produit(1, "pr1", "100", "200");
        produitList.add(p);
        Promotion promotion = new Promotion(1, "Promo", "Promotion 20%");
        Category category = new Category(1, produitList, promotion);
        CategoryDTO categoryDTO = new CategoryMapper().toDTO(category);
        Assertions.assertEquals(category.getId(), categoryDTO.getId());
        Assertions.assertEquals(category.getProduits().get(0).getId(), categoryDTO.getProduits().get(0).getId());
        Assertions.assertEquals(category.getPromotion().getId(), categoryDTO.getPromotion().getId());
    }

    @Test
    public void PromotionToDtoTest(){
        Promotion promotion = new Promotion(1, "Promo", "Promotion 20%");
        PromotionDTO promotionDTO = new PromotionMapper().toDTO(promotion);
        Assertions.assertEquals(promotionDTO.getId(), promotion.getId());
        Assertions.assertEquals(promotionDTO.getName(), promotion.getName());
        Assertions.assertEquals(promotionDTO.getDescription(), promotion.getDescription());
    }

    @Test
    public void PromotionDTOToEntityTest(){
        PromotionDTO promotionDTO = new PromotionDTO(1, "Promo", "Promotion 20%");
        Promotion promotion = new PromotionMapper().toEntity(promotionDTO);
        Assertions.assertEquals(promotion.getId(), promotionDTO.getId());
        Assertions.assertEquals(promotion.getName(), promotionDTO.getName());
        Assertions.assertEquals(promotion.getDescription(), promotionDTO.getDescription());
    }

    @Test
    public void CategoryDTOToEntityTest(){
        List<ProduitDTO> produitDTOList = new ArrayList<>();
        ProduitDTO produitDTO = new ProduitDTO(1, "pr1", "100", "200");
        produitDTOList.add(produitDTO);
        PromotionDTO promotionDTO = new PromotionDTO(1, "Promo", "Promotion 20%");
        CategoryDTO categoryDTO = new CategoryDTO(1, promotionDTO, produitDTOList);
        Category category = new CategoryMapper().toEntity(categoryDTO);
        Assertions.assertEquals(category.getId(), categoryDTO.getId());
        Assertions.assertEquals(category.getProduits().get(0).getId(), categoryDTO.getProduits().get(0).getId());
        Assertions.assertEquals(category.getPromotion().getId(), categoryDTO.getPromotion().getId());
    }

    @Test
    public void PanierDTOToEntityTest() {
        List<ProduitDTO> produitDTOList = new ArrayList<>();
        ProduitDTO produitDTO = new ProduitDTO(1, "pr1", "100", "200");
        produitDTOList.add(produitDTO);
        PanierDTO panierDTO = new PanierDTO(1, produitDTOList);
        Panier panier = new PanierMapper().toEntity(panierDTO);
        Assertions.assertEquals(panierDTO.getId(), panier.getId());
        Assertions.assertEquals(panierDTO.getProduits().get(0).getId(), panier.getProduits().get(0).getId());
    }

    @Test
    public void ProduitDTOToEntityTest() {
        ProduitDTO produitDTO = new ProduitDTO(1, "pr1", "100", "200");
        Produit produit = new ProduitMapper().toEntity(produitDTO);
        Assertions.assertEquals(produitDTO.getId(), produit.getId());
        Assertions.assertEquals(produitDTO.getName(), produit.getName());
        Assertions.assertEquals(produitDTO.getPrix_max(), produit.getPrix_max());
        Assertions.assertEquals(produitDTO.getPrix_min(), produit.getPrix_min());
    }
}
