package com.example.venteservice.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idp;
    private String marque;
    private String description;
    private Double prix;
    private Double quantite;


}