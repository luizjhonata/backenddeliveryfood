package com.luizjhonata.backendfooddelivery.repositories;

import com.luizjhonata.backendfooddelivery.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    //Novo método para buscar todos os produtos e mostar-los em ordem de preço DESC
    List<Product> findAllByOrderByPriceDesc();

}
