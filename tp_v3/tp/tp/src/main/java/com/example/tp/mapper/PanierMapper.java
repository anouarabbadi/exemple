package com.example.tp.mapper;

import com.example.tp.dto.PanierDTO;
import com.example.tp.dto.ProduitDTO;
import com.example.tp.model.Panier;
import com.example.tp.model.Produit;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PanierMapper {

    public Panier toEntity(PanierDTO panierDTO) {
        Panier panier = new Panier();
        panier.setId(panierDTO.getId());
        panier.setProduits(new ProduitMapper().toProduitEntity(panierDTO.getProduits()));
        return panier;
    }

    public PanierDTO toDTO(Panier panier) {
        PanierDTO panierDTO = new PanierDTO();
        panierDTO.setId(panier.getId());
        panierDTO.setProduits(new ProduitMapper().toProduitDto(panier.getProduits()));
        return panierDTO;
    }

    public List<Panier> toPanierEntity(List<PanierDTO> listPanierDto){
        return listPanierDto.stream().map(this::toEntity).collect(Collectors.toList());
    }

    public List<PanierDTO> toPanierDto(List<Panier> listPanier){
        return listPanier.stream().map(this::toDTO).collect(Collectors.toList());
    }

    public Panier update(PanierDTO panierDTO, Panier panier){
        // Mettre à jour l'entité panier avec les données de panierDTO
        return panier;
    }
}
