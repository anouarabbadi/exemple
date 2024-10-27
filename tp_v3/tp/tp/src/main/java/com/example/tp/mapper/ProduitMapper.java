package com.example.tp.mapper;

import com.example.tp.dto.ProduitDTO;
import com.example.tp.model.Produit;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProduitMapper {

    public Produit toEntity(ProduitDTO produitDTO){
        return new Produit(
                produitDTO.getId(),
                produitDTO.getName(),
                produitDTO.getPrix_max(),
                produitDTO.getPrix_min()
        );
    }

    public ProduitDTO toDTO(Produit produit) {
        return new ProduitDTO(
                produit.getId(),
                produit.getName(),
                produit.getPrix_max(),
                produit.getPrix_min()
        );
    }

    public List<Produit> toProduitEntity(List<ProduitDTO> listProduitDto){
        return listProduitDto.stream().map(this::toEntity).collect(Collectors.toList());
    }

    public List<ProduitDTO> toProduitDto(List<Produit> listProduit){
        return listProduit.stream().map(this::toDTO).collect(Collectors.toList());
    }


    public Produit update(ProduitDTO produitDto, Produit produit){
        produit.setName(produitDto.getName());
        produit.setPrix_max(produitDto.getPrix_max());
       produit.setPrix_min(produitDto.getPrix_min());
        return produit;
    }
}
