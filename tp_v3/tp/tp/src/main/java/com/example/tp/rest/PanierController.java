package com.example.tp.rest;

import com.example.tp.dto.PanierDTO;
import com.example.tp.service.PanierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/panier")
@RestController
public class PanierController {

    @Autowired
    private PanierService panierService;

    @GetMapping(path = "/getall")
    public List<PanierDTO> getAll() {
        return panierService.findAll();
    }

    @GetMapping(path = "/get/{id}")
    public PanierDTO getById(@PathVariable int id) {
        return panierService.findById(id);
    }

    @PostMapping(path = "/add")
    public void addPanier(@RequestBody PanierDTO panierDTO) {
        panierService.save(panierDTO);
    }

    @PutMapping(path = "/update")
    public void updatePanier(@RequestBody PanierDTO panierDTO) {
        panierService.update(panierDTO);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deletePanier(@PathVariable int id) {
        panierService.deleteById(id);
    }
}
