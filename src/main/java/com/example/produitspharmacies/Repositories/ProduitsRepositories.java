package com.example.produitspharmacies.Repositories;
import com.example.produitspharmacies.Entities.Produits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProduitsRepositories extends JpaRepository<Produits, Long > {
}
