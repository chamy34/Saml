package com.chaimaa.achteurservice.service;

import com.chaimaa.achteurservice.dto.AcheteurRequestDTO;
import com.chaimaa.achteurservice.dto.AcheteurResponseDTO;
import com.chaimaa.achteurservice.entities.Acheteur;
import com.chaimaa.achteurservice.mapper.AcheteurInterfaceMap;
import com.chaimaa.achteurservice.model.Produit;
import com.chaimaa.achteurservice.produits.ProduitFeignController;
import com.chaimaa.achteurservice.repositories.AcheteurRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
public class AcheteurServiceInterfaceImp implements AcheteurServiceInterface {
    @Autowired
    private ProduitFeignController produitFeignController;
@Autowired
    AcheteurRepository acheteurRepository;
@Autowired
AcheteurInterfaceMap acheteurInterfaceMap;
    @Override
    public void addAcheteur(AcheteurRequestDTO acheteurRequestDTO) {
Acheteur a=acheteurInterfaceMap.AcheteurRequestDTO2Acheteur(acheteurRequestDTO);
acheteurRepository.save(a);
    }

    @Override
    public void updateAcheteur(Integer ida, AcheteurRequestDTO acheteurRequestDTO) {
        Acheteur a1=acheteurRepository.findById(ida).get();
        if(acheteurRequestDTO.getNom()!=null) a1.setNom(acheteurRequestDTO.getNom());
        if(acheteurRequestDTO.getVille()!=null) a1.setVille(acheteurRequestDTO.getVille());
acheteurRepository.save(a1);
    }

    @Override
    public List<AcheteurResponseDTO> listerAcheteurs() {
        List<Produit> lp = produitFeignController.getAll();
        List<Acheteur> liste = new ArrayList<Acheteur>();
        liste=acheteurRepository.findAll();
        List<AcheteurResponseDTO> l=new ArrayList<AcheteurResponseDTO>();
        for (Acheteur a:liste){
            for(Produit produit:lp) {
                if(produit.getIdp() ==  a.getIdproduit()) {
                    a.setProduit(produit);
                    AcheteurResponseDTO a1 = acheteurInterfaceMap.Acheteur2AcheteurResponseDTO(a);
                    l.add(a1);
                    break;
                }
            }
        }
        return l;
    }

    @Override
    public AcheteurResponseDTO AcheteurById(Integer ida) {
        AcheteurResponseDTO a=new AcheteurResponseDTO();
        Acheteur a1=acheteurRepository.findById(ida).get();
        Produit p = produitFeignController.getId(a1.getIdproduit());
        a1.setProduit(p);
        a=acheteurInterfaceMap.Acheteur2AcheteurResponseDTO(a1);
        return a;
    }

    @Override
    public void supprimeAcheteur(Integer ida) {
        acheteurRepository.deleteById(ida);

    }
}
