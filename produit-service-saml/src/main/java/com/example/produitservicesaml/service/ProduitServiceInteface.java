package com.example.produitservicesaml.service;


import com.example.produitservicesaml.dto.ProduitRequestDTO;
import com.example.produitservicesaml.dto.ProduitResponseDTO;

import java.util.List;

public interface ProduitServiceInteface {

    //post
    public void addProduit(ProduitRequestDTO produitRequestDTO);
    //put
    public void updateProduit(Integer idp, ProduitRequestDTO p);
    //Get
    public List<ProduitResponseDTO> listerProduits();

    //GetById
    public ProduitResponseDTO ProduitById(Integer idp);
    //Delete
    public void supprime(Integer idp);
}
