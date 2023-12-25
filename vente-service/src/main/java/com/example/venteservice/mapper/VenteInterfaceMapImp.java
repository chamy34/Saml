package com.example.venteservice.mapper;

import com.example.venteservice.dto.VenteRequestDTO;
import com.example.venteservice.dto.VenteResponseDTO;
import com.example.venteservice.entities.Vente;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class VenteInterfaceMapImp implements  VenteInterfaceMap{

    @Override
    public Vente VenteRequestDTO2Vente(VenteRequestDTO venteRequestDTO) {
        Vente a=new Vente();
        BeanUtils.copyProperties(venteRequestDTO,a);
        return a;
    }

    @Override
    public VenteResponseDTO Vente2VenteResponseDTO(Vente vente) {
        VenteResponseDTO venteResponseDTO =new VenteResponseDTO();
        BeanUtils.copyProperties(vente,venteResponseDTO);
        return venteResponseDTO;
    }
}
