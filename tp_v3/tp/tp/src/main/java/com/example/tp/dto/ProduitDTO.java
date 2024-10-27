package com.example.tp.dto;

public class ProduitDTO {

    private int id;

    private String name;
    private String prix_max;
    private String prix_min;

    public ProduitDTO(int id, String name, String prix_max, String prix_min) {
        this.id = id;
        this.name = name;
        this.prix_max = prix_max;
        this.prix_min = prix_min;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrix_max() {
        return prix_max;
    }

    public void setPrix_max(String prix_max) {
        this.prix_max = prix_max;
    }

    public String getPrix_min() {
        return prix_min;
    }

    public void setPrix_min(String prix_min) {
        this.prix_min = prix_min;
    }
}