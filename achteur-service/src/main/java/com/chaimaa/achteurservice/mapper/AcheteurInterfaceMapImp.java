package com.chaimaa.achteurservice.mapper;

import com.chaimaa.achteurservice.dto.AcheteurRequestDTO;
import com.chaimaa.achteurservice.dto.AcheteurResponseDTO;
import com.chaimaa.achteurservice.entities.Acheteur;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AcheteurInterfaceMapImp implements AcheteurInterfaceMap{
    @Override
    public Acheteur AcheteurRequestDTO2Acheteur(AcheteurRequestDTO acheteurRequestDTO) {
        Acheteur a=new Acheteur();
        BeanUtils.copyProperties(acheteurRequestDTO,a);
        return a;
    }

    @Override
    public AcheteurResponseDTO Acheteur2AcheteurResponseDTO(Acheteur acheteur) {
        AcheteurResponseDTO acheteurResponseDTO =new AcheteurResponseDTO();
        BeanUtils.copyProperties(acheteur,acheteurResponseDTO);
        return acheteurResponseDTO;
    }
}
