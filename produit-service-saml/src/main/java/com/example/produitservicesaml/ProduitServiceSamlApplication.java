package com.example.produitservicesaml;

        import com.example.produitservicesaml.config.GlobalConfig;
        import com.example.produitservicesaml.entities.Produit;
        import com.example.produitservicesaml.repositories.ProduitRepository;
        import org.springframework.boot.CommandLineRunner;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.boot.context.properties.EnableConfigurationProperties;
        import org.springframework.context.annotation.Bean;

        import java.util.List;

@SpringBootApplication
@EnableConfigurationProperties({GlobalConfig.class})
public class ProduitServiceSamlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProduitServiceSamlApplication.class, args);
    }


    @Bean
    CommandLineRunner start(ProduitRepository produitRepository) {
        return args -> {
            Produit p = Produit.builder().prix(3000.0).marque("Hp").quantite(4.0).description("Ordinateur 5eme generation 8Go Ram").build();
            Produit p1 = Produit.builder().prix(30000.0).marque("Mac").quantite(4.0).description("Ordinateur 12eme generation 18Go Ram").build();
            produitRepository.save(p);
            produitRepository.save(p1);

            List<Produit> listes = produitRepository.findAll();
            for (Produit cp : listes) {
                System.out.println("--------------------");
                System.out.println(cp.getIdp());
                System.out.println(cp.getPrix());
                System.out.println(cp.getDescription());
                System.out.println(cp.getMarque());
                System.out.println(cp.getQuantite());
            }


        };
    }
}
