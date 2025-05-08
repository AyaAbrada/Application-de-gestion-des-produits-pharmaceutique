package com.example.produitspharmacies.Controller.Impl;
import com.example.produitspharmacies.Entities.Produits;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ProduitsController {
    @PostMapping
    String addProduits(@RequestBody  Produits produits);

    @GetMapping("/{id}")
    Produits retrieveProduits(@PathVariable Long id);

    @GetMapping
    List<Produits> retrieveAllProduits();

    @DeleteMapping("/{id}")
    String removeProduits( @PathVariable Long id);


   @PutMapping()
   Produits updateProduits(@RequestBody Produits produits);

}
