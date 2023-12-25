package com.example.venteservice.service;

import com.example.venteservice.dto.VenteRequestDTO;
import com.example.venteservice.dto.VenteResponseDTO;

import java.util.List;

public interface VenteServiceInterface {
    //post
    public void addVente(VenteRequestDTO venteRequestDTO);
    //Update
    public void updateVente (Integer ida, VenteRequestDTO venteRequestDTO);
    //Get
    public List<VenteResponseDTO> listerVentes ();
    //GetById
    public VenteResponseDTO VenteById(Integer id);
    //Delete
    public void supprimeVente (Integer id);
}
