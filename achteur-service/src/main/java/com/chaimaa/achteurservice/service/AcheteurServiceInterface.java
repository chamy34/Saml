package com.chaimaa.achteurservice.service;

import com.chaimaa.achteurservice.dto.AcheteurRequestDTO;
import com.chaimaa.achteurservice.dto.AcheteurResponseDTO;
import com.chaimaa.achteurservice.entities.Acheteur;

import java.util.List;

public interface AcheteurServiceInterface {
    //post
    public void addAcheteur(AcheteurRequestDTO acheteurRequestDTO);
    //Update
    public void updateAcheteur(Integer ida, AcheteurRequestDTO acheteurRequestDTO);
    //Get
    public List<AcheteurResponseDTO> listerAcheteurs();
    //GetById
    public AcheteurResponseDTO AcheteurById(Integer ida);
    //Delete
    public void supprimeAcheteur(Integer ida);
}
