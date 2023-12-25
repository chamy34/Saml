package com.example.venteservice.produits;

import com.example.venteservice.model.Produit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="PRODUIT-SERVICE")
public interface ProduitFeignController {
    @GetMapping("/api/produits")
    public List<Produit> getAllP();
    @GetMapping("/api/produits/{idp}")
    public Produit getIdP(@PathVariable Integer idp);
}
