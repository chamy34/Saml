package com.example.produitservicesaml.web;


import com.example.produitservicesaml.config.GlobalConfig;
import com.example.produitservicesaml.dto.ProduitRequestDTO;
import com.example.produitservicesaml.dto.ProduitResponseDTO;
import com.example.produitservicesaml.service.ProduitServiceInteface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {
    @Autowired
    GlobalConfig globalConfig;
    @Autowired
    ProduitServiceInteface produitServiceInteface;

    @GetMapping("/globalconfig")
    public GlobalConfig globalConfig(){
        return globalConfig;
    }
    @GetMapping("/produits")
    public List<ProduitResponseDTO> getAll(){
        return produitServiceInteface.listerProduits();
    }
    @GetMapping("/produits/{idp}")
    public ProduitResponseDTO getId(@PathVariable Integer idp){
        return produitServiceInteface.ProduitById(idp);
    }
    @PostMapping("/produits")
    public void save(@RequestBody ProduitRequestDTO p){
     produitServiceInteface.addProduit(p);
    }
    @PutMapping("/produits/{idp}")
    public void update( @PathVariable("idp") Integer idp,@RequestBody ProduitRequestDTO p){
        produitServiceInteface.updateProduit(idp,p);
    }
    @DeleteMapping("/produits/{idp}")
    public void  delete(@PathVariable Integer idp){
        produitServiceInteface.supprime(idp);
    }


}
