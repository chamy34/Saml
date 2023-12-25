package com.example.venteservice.achteurs;

import com.example.venteservice.model.Acheteur;
import com.example.venteservice.model.Produit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="ACHTEUR-SERVICE")
public interface AchteurFeignController {
    @GetMapping("/api/acheteurs")
    public List<Acheteur> getAllA();
    @GetMapping("/api/acheteurs/{ida}")
    public Produit getId(@PathVariable Integer ida);
}
