package com.luizjhonata.backendfooddelivery.controllers;

import com.luizjhonata.backendfooddelivery.dto.ProductDTO;
import com.luizjhonata.backendfooddelivery.entities.Product;
import com.luizjhonata.backendfooddelivery.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired     //Injeção de dependência do ProductService
    private ProductService service;


    @GetMapping
    public ResponseEntity<List<ProductDTO>> findAllByOrderByPriceDesc() {
        List<ProductDTO> list = service.findAllByOrderByPriceDesc();
        return ResponseEntity.ok().body(list);
    }

}
