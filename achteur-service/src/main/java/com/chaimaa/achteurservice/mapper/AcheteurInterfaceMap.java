package com.chaimaa.achteurservice.mapper;

import com.chaimaa.achteurservice.dto.AcheteurRequestDTO;
import com.chaimaa.achteurservice.dto.AcheteurResponseDTO;
import com.chaimaa.achteurservice.entities.Acheteur;

public interface AcheteurInterfaceMap {
    public Acheteur AcheteurRequestDTO2Acheteur (AcheteurRequestDTO acheteurRequestDTO);
    public AcheteurResponseDTO Acheteur2AcheteurResponseDTO (Acheteur acheteur);
}
