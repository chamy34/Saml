package com.example.produitservicesaml.mapper;


import com.example.produitservicesaml.dto.ProduitRequestDTO;
import com.example.produitservicesaml.dto.ProduitResponseDTO;
import com.example.produitservicesaml.entities.Produit;

public interface ProduitInterfaceMap {
    public Produit ProduitRequestDTO2Produit(ProduitRequestDTO p);
    public ProduitResponseDTO Produit2ProduitResponseDTO(Produit p);
}
