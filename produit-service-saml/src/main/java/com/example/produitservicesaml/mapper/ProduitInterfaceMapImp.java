package com.example.produitservicesaml.mapper;


import com.example.produitservicesaml.dto.ProduitRequestDTO;
import com.example.produitservicesaml.dto.ProduitResponseDTO;
import com.example.produitservicesaml.entities.Produit;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ProduitInterfaceMapImp implements ProduitInterfaceMap {
    @Override
    public Produit ProduitRequestDTO2Produit(ProduitRequestDTO p) {
        Produit c= new Produit();
        BeanUtils.copyProperties(p,c);
        return c;
    }

    @Override
    public ProduitResponseDTO Produit2ProduitResponseDTO(Produit p) {
        ProduitResponseDTO c = new ProduitResponseDTO();
        BeanUtils.copyProperties(p,c);
        return c;
    }
}
