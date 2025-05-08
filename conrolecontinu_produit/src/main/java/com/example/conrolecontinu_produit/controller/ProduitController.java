package com.example.conrolecontinu_produit.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.conrolecontinu_produit.enitity.Produit;
import com.example.conrolecontinu_produit.service.IProduitService;

@RestController
@RequestMapping("/api/produits")
public class ProduitController {

    private final IProduitService produitService;

    public ProduitController(IProduitService produitService) {
        this.produitService = produitService;
    }

    @PostMapping
    public ResponseEntity<Produit> ajouterProduit(@RequestBody Produit produit) {
        Produit nouveauProduit = produitService.ajouterProduit(produit);
        return new ResponseEntity<>(nouveauProduit, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Produit>> listeProduits() {
        List<Produit> produits = produitService.listeProduits();
        return new ResponseEntity<>(produits, HttpStatus.OK);
    }
}