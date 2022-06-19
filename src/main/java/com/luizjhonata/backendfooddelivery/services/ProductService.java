package com.luizjhonata.backendfooddelivery.services;

import com.luizjhonata.backendfooddelivery.dto.ProductDTO;
import com.luizjhonata.backendfooddelivery.entities.Product;
import com.luizjhonata.backendfooddelivery.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    //Injeção de dependência do ProductRepository
    @Autowired
    private ProductRepository repository;


    //SERVICE para buscar todos os Produtos Pelo Preço DESC
    //Garante o fechamento da conexão com o banco de dados, não realizando unlock, ficando assim mais rápido
    @Transactional(readOnly = true)
    public List<ProductDTO> findAllByOrderByPriceDesc() {
        List<Product> list = repository.findAllByOrderByPriceDesc();
        return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
    }

    //SERVICE para inserir novos produtos
    @Transactional
    public ProductDTO insert(ProductDTO dto) {
        Product product = new Product(null, dto.getName(), dto.getDescription(), dto.getPrice(), dto.getImageUri());
        product = repository.save(product);
        return new ProductDTO(product);
    }


}
