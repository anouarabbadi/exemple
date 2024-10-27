package com.example.tp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.tp.model.Produit;
import org.springframework.stereotype.Repository;


@Repository
public interface ProduitRepository extends JpaRepository<Produit, Integer> {



}
