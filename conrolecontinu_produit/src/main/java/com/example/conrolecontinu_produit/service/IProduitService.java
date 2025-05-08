package com.example.conrolecontinu_produit.service;

import java.util.List;

import com.example.conrolecontinu_produit.enitity.Produit;

public interface IProduitService {
    Produit ajouterProduit(Produit produit);
    List<Produit> listeProduits();
}