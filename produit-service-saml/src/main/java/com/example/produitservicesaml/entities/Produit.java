package com.example.produitservicesaml.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data @ToString @NoArgsConstructor @AllArgsConstructor @Builder
public class Produit {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idp;
    private String marque;
    private String description;
    private Double prix;
    private Double quantite;


}
