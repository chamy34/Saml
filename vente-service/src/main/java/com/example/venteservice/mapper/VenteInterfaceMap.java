package com.example.venteservice.mapper;

import com.example.venteservice.dto.VenteRequestDTO;
import com.example.venteservice.dto.VenteResponseDTO;
import com.example.venteservice.entities.Vente;

public interface VenteInterfaceMap {
    public Vente VenteRequestDTO2Vente (VenteRequestDTO venteRequestDTO);
    public VenteResponseDTO Vente2VenteResponseDTO (Vente vente);
}

