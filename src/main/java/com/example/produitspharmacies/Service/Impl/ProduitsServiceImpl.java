package com.example.produitspharmacies.Service.Impl;
import com.example.produitspharmacies.Entities.Produits;
import com.example.produitspharmacies.Repositories.ProduitsRepositories;
import com.example.produitspharmacies.Service.ProduitsService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Service
public class ProduitsServiceImpl implements ProduitsService {

    @Autowired
    private ProduitsRepositories produitsRepositories;

    @Override
    public String addProduits(Produits produits) {
        produitsRepositories.save(produits);
        return "Produits added succefully";
    }

    @Override
    public Produits updateProduits(Produits produits) {
        return produitsRepositories.save(produits);
    }


    @Override
    public String deleteProduits(Long id) {
        produitsRepositories.deleteById(id);
        return "Produits deleted succefully";
    }

    @Override
    public Produits getProduits(Long id) {

        return  produitsRepositories.findById(id).orElse(null);
    }

    @Override
    public List<Produits> getAllProduits() {

        return produitsRepositories.findAll();
    }


}
