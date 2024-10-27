package com.example.tp.service;

import com.example.tp.dto.PanierDTO;

import java.util.List;

public interface PanierService {
    List<PanierDTO> findAll();
    PanierDTO findById(int id);
    void save(PanierDTO panierDTO);
    void update(PanierDTO panierDTO);
    void deleteById(int id);
}
