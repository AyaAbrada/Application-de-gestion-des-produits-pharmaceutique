package com.example.produitspharmacies.Service;
import com.example.produitspharmacies.Entities.Produits;

import java.util.List;


public interface ProduitsService {
    String addProduits (Produits produits);
    String updateProduits (Produits produits);
    String deleteProduits (Long id);
    Produits getProduits (Long id);
    List<Produits> getAllProduits();
}
