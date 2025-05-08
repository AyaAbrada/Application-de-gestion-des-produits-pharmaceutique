package com.example.produitspharmacies.Service;
import com.example.produitspharmacies.Entities.Produits;

import java.util.List;


public interface ProduitsService {
    List<Produits> getAllProduits();
    String addProduits (Produits produits);
    Produits updateProduits (Produits produits);
    String deleteProduits (Long id);
    Produits getProduits (Long id);

}
