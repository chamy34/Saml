package com.example.venteservice;

import com.example.venteservice.entities.Vente;
import com.example.venteservice.repositories.VenteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
@EnableFeignClients
public class VenteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VenteServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(VenteRepository venteRepository){
		return args -> {
			Vente a = Vente.builder().annee(2023).mois(11).quantite(1).id_ach(1).id_prod(1).build();
			Vente b = Vente.builder().annee(2023).mois(11).quantite(1).id_ach(2).id_prod(2).build();
			Vente c = Vente.builder().build();
			venteRepository.save(a);
			venteRepository.save(b);
			venteRepository.save(c);

			List<Vente> listes= venteRepository.findAll();
			for(Vente ac:listes){
				System.out.println("--------------------");
				System.out.println(ac.getAnnee());
				System.out.println(ac.getMois());
				System.out.println(ac.getId_prod());
				System.out.println(ac.getProduit());
				System.out.println(ac.getId_ach());
				System.out.println(ac.getAcheteur());
			}
		};
	}

}
