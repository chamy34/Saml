package com.chaimaa.achteurservice.entities;

import com.chaimaa.achteurservice.model.Produit;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString @Builder
public class Acheteur {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ida;
    private String nom;
    private String ville;
    private Integer idproduit;
    @Transient
    private Produit produit;

}
