package com.chaimaa.achteurservice.produits;

import com.chaimaa.achteurservice.model.Produit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="PRODUIT-SERVICE")
public interface ProduitFeignController {
    @GetMapping("/api/produits")
    public List<Produit> getAll();
    @GetMapping("/api/produits/{idp}")
    public Produit getId(@PathVariable Integer idp);
}
