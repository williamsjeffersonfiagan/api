package com.example.conrolecontinu_produit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.conrolecontinu_produit.enitity.Produit;
import com.example.conrolecontinu_produit.repository.ProduitRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class ProduitService implements IProduitService {

    private final ProduitRepository produitRepository;

    @Override
    public Produit ajouterProduit(Produit produit) {

        if (produit.getPrix() <= 0) { 
            throw new IllegalArgumentException("Le prix doit être positif");
        }
        
        return produitRepository.save(produit);
    }

    @Override
    public List<Produit> listeProduits() {
        return produitRepository.findAll();
    }
}
