package com.example.tp.service.impl;

import com.example.tp.dto.ProduitDTO;
import com.example.tp.mapper.ProduitMapper;
import com.example.tp.model.Produit;
import com.example.tp.repository.ProduitRepository;
import com.example.tp.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImpl implements ProduitService {

    ProduitRepository produitRepository;

    public ProduitServiceImpl(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    @Override
    public List<ProduitDTO> findAll() {
        return mapper.toProduitDto(produitRepository.findAll());
    }

    @Autowired
    ProduitMapper mapper;

    @Override
    public void save(ProduitDTO produitDTO) {
        produitRepository.save(mapper.toEntity(produitDTO));

    }

    @Override
    public void update(ProduitDTO produitDTO) {
        Produit produit = produitRepository.findById(produitDTO.getId()).get();
        mapper.update(produitDTO,produit);
        produitRepository.save(produit);
    }





}
