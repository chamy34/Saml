package com.example.produitservicesaml.dto;


import lombok.*;

@Data @AllArgsConstructor @NoArgsConstructor @Builder @ToString
public class ProduitResponseDTO {
    private Integer idp;
    private String marque;
    private String description;
    private Double prix;
    private Double quantite;
}
