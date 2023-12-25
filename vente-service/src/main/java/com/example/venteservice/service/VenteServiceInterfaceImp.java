package com.example.venteservice.service;


import com.example.venteservice.achteurs.AchteurFeignController;
import com.example.venteservice.dto.VenteRequestDTO;
import com.example.venteservice.dto.VenteResponseDTO;
import com.example.venteservice.entities.Vente;
import com.example.venteservice.mapper.VenteInterfaceMap;
import com.example.venteservice.model.Acheteur;
import com.example.venteservice.model.Produit;
import com.example.venteservice.produits.ProduitFeignController;
import com.example.venteservice.repositories.VenteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class VenteServiceInterfaceImp implements VenteServiceInterface {
    @Autowired
    private AchteurFeignController achteurFeignController;

    @Autowired
    private ProduitFeignController produitFeignController;
    @Autowired
    VenteRepository venteRepository;
    @Autowired
    VenteInterfaceMap venteInterfaceMap;

    @Override
    public void addVente(VenteRequestDTO venteRequestDTO) {
        Vente a= venteInterfaceMap.VenteRequestDTO2Vente(venteRequestDTO);
        venteRepository.save(a);
    }

    @Override
    public void updateVente(Integer ida, VenteRequestDTO venteRequestDTO) {
        Vente a1= venteRepository.findById(ida).get();
        if(venteRequestDTO.getMois()!=null) a1.setMois(venteRequestDTO.getMois());
        if(venteRequestDTO.getAnnee()!=null) a1.setAnnee(venteRequestDTO.getAnnee());
        if(venteRequestDTO.getQuantite()!=null) a1.setQuantite(venteRequestDTO.getQuantite());
        if(venteRequestDTO.getAcheteur()!=null) a1.setAcheteur(venteRequestDTO.getAcheteur());
        if(venteRequestDTO.getProduit()!=null) a1.setProduit(venteRequestDTO.getProduit());
        if(venteRequestDTO.getId_ach()!=null) a1.setId_ach(venteRequestDTO.getId_ach());
        if(venteRequestDTO.getId_prod()!=null) a1.setId_prod(venteRequestDTO.getId_prod());
        venteRepository.save(a1);
    }

    @Override
    public List<VenteResponseDTO> listerVentes() {
        List<Produit> lp = produitFeignController.getAllP();
        List<Acheteur> ls = achteurFeignController.getAllA();
        List<Vente> liste = new ArrayList<Vente>();
        liste = venteRepository.findAll();
        List<VenteResponseDTO> l = new ArrayList<VenteResponseDTO>();
        for (Vente a : liste) {
            for (Produit produit : lp) {
                if (produit.getIdp() == a.getId_prod()) {
                    a.setProduit(produit);


                }
                break;
                }
                for (Acheteur achteur : ls) {
                    if (achteur.getIda() == a.getId_ach()) {
                        a.setAcheteur(achteur);


                    }
                    break;
                }
            VenteResponseDTO a1 = venteInterfaceMap.Vente2VenteResponseDTO(a);
            l.add(a1);
        }
            return l;


    }

    @Override
    public VenteResponseDTO VenteById(Integer id) {
        VenteResponseDTO a=new VenteResponseDTO();
        Vente a1=venteRepository.findById(id).get();
        Produit p = produitFeignController.getIdP(a1.getId_prod());
        a1.setProduit(p);
        a=venteInterfaceMap.Vente2VenteResponseDTO(a1);
        return a;
    }

    @Override
    public void supprimeVente(Integer id) {
        venteRepository.deleteById(id);

    }
}
