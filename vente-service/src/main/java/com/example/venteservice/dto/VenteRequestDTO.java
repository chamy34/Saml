package com.example.venteservice.dto;
import com.example.venteservice.model.Acheteur;
import com.example.venteservice.model.Produit;
import jakarta.persistence.Transient;
import lombok.*;

@Data @AllArgsConstructor @NoArgsConstructor @Builder @ToString
public class VenteRequestDTO {

    private Integer id_ach;
    private Integer id_prod;
    private Integer quantite;
    private Integer mois;
    private Integer annee;
    @Transient
    private Acheteur acheteur;
    @Transient
    private Produit produit;
}
