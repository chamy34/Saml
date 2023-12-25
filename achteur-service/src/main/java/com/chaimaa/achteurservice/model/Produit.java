package com.chaimaa.achteurservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data @Builder
public class Produit {

    private Integer idp;
    private String marque;
    private String description;
    private Double prix;
    private Double quantite;
}
