package com.example.conrolecontinu_produit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.conrolecontinu_produit.enitity.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
    
}
