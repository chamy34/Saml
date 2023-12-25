package com.chaimaa.achteurservice.dto;

import com.chaimaa.achteurservice.model.Produit;
import jakarta.persistence.Transient;
import lombok.*;

@Data @AllArgsConstructor @NoArgsConstructor @Builder @ToString
public class AcheteurRequestDTO {

    private String nom;
    private String ville;
    private Integer idproduit;
    @Transient
    private Produit produit;
}
