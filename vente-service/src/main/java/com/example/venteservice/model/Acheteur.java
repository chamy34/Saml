package com.example.venteservice.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Acheteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ida;
    private String nom;
    private String ville;
    private Integer idproduit;
    @Transient
    private Produit produit;

}