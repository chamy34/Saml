package com.chaimaa.achteurservice;

import com.chaimaa.achteurservice.entities.Acheteur;
import com.chaimaa.achteurservice.repositories.AcheteurRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
@EnableFeignClients
public class AchteurServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AchteurServiceApplication.class, args);
	}

@Bean
	CommandLineRunner start(AcheteurRepository acheteurRepository){
		return args -> {
			Acheteur a = Acheteur.builder().nom("ChaimaaFahmi").ville("Berrechid").idproduit(1).build();
			Acheteur b = Acheteur.builder().nom("EL Fid nouhaima").ville("Rabat").idproduit(2).build();
			acheteurRepository.save(a);
			acheteurRepository.save(b);

			List<Acheteur> listes= acheteurRepository.findAll();
			for(Acheteur ac:listes){
				System.out.println("--------------------");
				System.out.println(ac.getNom());
				System.out.println(ac.getVille());
				System.out.println(ac.getProduit());
			}
		};
}
}
