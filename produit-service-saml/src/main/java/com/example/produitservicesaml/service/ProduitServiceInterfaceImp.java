package com.example.produitservicesaml.service;


import com.example.produitservicesaml.dto.ProduitRequestDTO;
import com.example.produitservicesaml.dto.ProduitResponseDTO;
import com.example.produitservicesaml.entities.Produit;
import com.example.produitservicesaml.mapper.ProduitInterfaceMap;
import com.example.produitservicesaml.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
public class ProduitServiceInterfaceImp implements ProduitServiceInteface{
    @Autowired
    ProduitRepository produitRepository;
   @Autowired
   ProduitInterfaceMap produitInterfaceMap;

    public void addProduit(ProduitRequestDTO produitRequestDTO) {

        Produit p=produitInterfaceMap.ProduitRequestDTO2Produit(produitRequestDTO);
           produitRepository.save(p);
    }


    public void updateProduit(Integer idp, ProduitRequestDTO p) {
        Produit P1 = produitRepository.findById(idp).get();
        if(p.getDescription()!=null) P1.setDescription(p.getDescription());
        if(p.getPrix()!=null) P1.setPrix(p.getPrix());
        if(p.getMarque()!=null) P1.setMarque(p.getMarque());
        if(p.getQuantite()!=null) P1.setQuantite(p.getQuantite());
produitRepository.save(P1);
    }

    public List<ProduitResponseDTO> listerProduits() {
        List<Produit> liste = new ArrayList<Produit>();

        liste = produitRepository.findAll();

        List<ProduitResponseDTO> l= new ArrayList<ProduitResponseDTO>();

        for (Produit p:liste) {
            ProduitResponseDTO r = new ProduitResponseDTO();
            r=	produitInterfaceMap.Produit2ProduitResponseDTO(p);
            l.add(r);
        }

        return l;
    }

    public ProduitResponseDTO ProduitById(Integer idp) {
        ProduitResponseDTO p = new ProduitResponseDTO();
        Produit p1= produitRepository.findById(idp).get();
        p=produitInterfaceMap.Produit2ProduitResponseDTO(p1);
        return p;
    }
    public void supprime(Integer idp)
    {
produitRepository.deleteById(idp);
    }
}
