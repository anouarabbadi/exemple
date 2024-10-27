package com.example.tp.rest;

import com.example.tp.dto.ProduitDTO;
import com.example.tp.model.Produit;
import com.example.tp.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/produit")
@RestController
public class ProduitController {

    @Autowired
    ProduitService produitService;

    @GetMapping(path = "/getall")
    public List<ProduitDTO> getAll(){
        return produitService.findAll();
    }




    @PutMapping(path = "addProduit")
    void addProduit(@RequestBody ProduitDTO produitDTO){
        produitService.save(produitDTO);
    }


    @PatchMapping(path = "modifyProduit")
    void modifyProduit(@RequestBody ProduitDTO produitDTO){
        produitService.update(produitDTO);
    }
}
