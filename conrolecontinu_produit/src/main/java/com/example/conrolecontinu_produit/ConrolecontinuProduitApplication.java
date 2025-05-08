package com.example.conrolecontinu_produit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.conrolecontinu_produit.enitity.Produit;
import com.example.conrolecontinu_produit.repository.ProduitRepository;

@SpringBootApplication
public class ConrolecontinuProduitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConrolecontinuProduitApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ProduitRepository produitRepository) {
        return args -> {
            // Insertion de produits
            produitRepository.save(new Produit(
                null,                       
                "Ordinateur Portable",     
                999,                        
                10                          
            ));

            produitRepository.save(new Produit(
                null,
                "Souris Sans Fil",
                30,
                50
            ));

            produitRepository.save(new Produit(
                null,
                "Clavier Mécanique",
                89,
                25
            ));

        
        };
    }
}


