package com.example.tp.service;

import com.example.tp.dto.ProduitDTO;
import com.example.tp.model.Produit;

import java.util.List;

public interface ProduitService {

    List<ProduitDTO> findAll();

    void save(ProduitDTO produitDTO);

    void update(ProduitDTO produitDTO);
}
