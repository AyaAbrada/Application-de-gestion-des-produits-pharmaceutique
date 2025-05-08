package com.example.produitspharmacies.Controller.Impl.Impl;

import com.example.produitspharmacies.Controller.Impl.ProduitsController;
import com.example.produitspharmacies.Entities.Produits;
import com.example.produitspharmacies.Service.ProduitsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/produits")
@RestController
public class ProduitControllerImpl implements ProduitsController {

    @Autowired
    private ProduitsService produitsService;

    @Override
    public String addProduits(Produits produits) {

        return produitsService.addProduits(produits);
    }

    @Override
    public Produits retrieveProduits(Long id) {

        return produitsService.getProduits(id);
    }

    @Override
    public List<Produits> retrieveAllProduits() {

        return produitsService.getAllProduits();
    }

    @Override
    public String removeProduits(Long id) {

        return produitsService.deleteProduits(id);
    }

    @Override
    public Produits updateProduits(Produits produits) {
        return produitsService.updateProduits(produits);
    }


}
