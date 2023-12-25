package com.example.venteservice.entities;

import com.example.venteservice.model.Acheteur;
import com.example.venteservice.model.Produit;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Vente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
