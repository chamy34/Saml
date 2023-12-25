package com.chaimaa.achteurservice.dto;

import com.chaimaa.achteurservice.model.Produit;
import jakarta.persistence.Transient;
import lombok.*;

@Data @NoArgsConstructor @AllArgsConstructor @Builder @ToString
public class AcheteurResponseDTO {
    private Integer ida;
    private String nom;
    private String ville;
    private Integer idproduit;
    @Transient
    private Produit produit;
}
