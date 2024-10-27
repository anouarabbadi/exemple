package com.example.tp.service.impl;

import com.example.tp.dto.PanierDTO;
import com.example.tp.mapper.PanierMapper;
import com.example.tp.model.Panier;
import com.example.tp.repository.PanierRepository;
import com.example.tp.service.PanierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PanierServiceImpl implements PanierService {

    @Autowired
    private PanierRepository panierRepository;

    @Autowired
    private PanierMapper panierMapper;

    @Override
    public List<PanierDTO> findAll() {
        return panierMapper.toPanierDto(panierRepository.findAll());
    }

    @Override
    public PanierDTO findById(int id) {
        Panier panier = panierRepository.findById(id).orElse(null);
        return panier != null ? panierMapper.toDTO(panier) : null;
    }

    @Override
    public void save(PanierDTO panierDTO) {
        Panier panier = panierMapper.toEntity(panierDTO);
        panierRepository.save(panier);
    }

    @Override
    public void update(PanierDTO panierDTO) {
        Panier panier = panierRepository.findById(panierDTO.getId()).orElse(null);
        if (panier != null) {
            panier = panierMapper.update(panierDTO, panier);
            panierRepository.save(panier);
        }
    }

    @Override
    public void deleteById(int id) {
        panierRepository.deleteById(id);
    }
}
