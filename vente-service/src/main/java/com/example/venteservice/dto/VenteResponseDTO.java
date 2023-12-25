package com.example.venteservice.dto;
import com.example.venteservice.model.Acheteur;
import com.example.venteservice.model.Produit;
import jakarta.persistence.Transient;
import lombok.*;

@Data @NoArgsConstructor @AllArgsConstructor @Builder @ToString
public class VenteResponseDTO {
    private Integer id_vente;
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
