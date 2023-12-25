package com.chaimaa.achteurservice.web;

import com.chaimaa.achteurservice.dto.AcheteurRequestDTO;
import com.chaimaa.achteurservice.dto.AcheteurResponseDTO;
import com.chaimaa.achteurservice.produits.ProduitFeignController;
import com.chaimaa.achteurservice.service.AcheteurServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    @Autowired
    AcheteurServiceInterface acheteurServiceInterface;
    @GetMapping("/acheteurs")
    public List<AcheteurResponseDTO> getAll(){
        return acheteurServiceInterface.listerAcheteurs();
    }
    @GetMapping("/acheteurs/{ida}")
    public AcheteurResponseDTO getId(@PathVariable Integer ida){

        return acheteurServiceInterface.AcheteurById(ida);

    }
    @PostMapping("/acheteurs")
    public void save(@RequestBody AcheteurRequestDTO a){
        acheteurServiceInterface.addAcheteur(a);
    }
    @DeleteMapping("/acheteurs/{ida}")
    public void delete(@PathVariable Integer ida){
        acheteurServiceInterface.supprimeAcheteur(ida);
    }
    @PutMapping("/acheteurs/{ida}")
    public void update( @PathVariable("ida") Integer ida,@RequestBody AcheteurRequestDTO p){
        acheteurServiceInterface.updateAcheteur(ida,p);
    }
}
