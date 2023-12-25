package com.example.venteservice.web;

import com.example.venteservice.dto.VenteRequestDTO;
import com.example.venteservice.dto.VenteResponseDTO;
import com.example.venteservice.service.VenteServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {


        @Autowired
        VenteServiceInterface venteServiceInterface;
        @GetMapping("/ventes")
        public List<VenteResponseDTO> getAll(){
            return venteServiceInterface.listerVentes();
        }
        @GetMapping("/ventes/{ida}")
        public VenteResponseDTO getId(@PathVariable Integer ida){

            return venteServiceInterface.VenteById(ida);

        }
        @PostMapping("/ventes")
        public void save(@RequestBody VenteRequestDTO a){
            venteServiceInterface.addVente(a);
        }
        @DeleteMapping("/ventes/{ida}")
        public void delete(@PathVariable Integer ida){
            venteServiceInterface.supprimeVente(ida);
        }
        @PutMapping("/ventes/{ida}")
        public void update( @PathVariable("ida") Integer ida,@RequestBody VenteRequestDTO p){
            venteServiceInterface.updateVente(ida,p);
        }
    }

