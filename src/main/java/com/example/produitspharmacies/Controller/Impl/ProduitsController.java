package com.example.produitspharmacies.Controller.Impl;
import com.example.produitspharmacies.Entities.Produits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface ProduitsController {
    @PostMapping()
    String addProduits(Produits produits);

    @GetMapping("/{id}")
    String retrieveProduits(@PathVariable Long id);

    @GetMapping()
    List<Produits> retrieveAllProduits();



}
