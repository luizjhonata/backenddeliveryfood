package com.luizjhonata.backendfooddelivery.controllers;

import com.luizjhonata.backendfooddelivery.dto.OrderDTO;
import com.luizjhonata.backendfooddelivery.dto.ProductDTO;
import com.luizjhonata.backendfooddelivery.entities.Product;
import com.luizjhonata.backendfooddelivery.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "products")
public class ProductController {

    @Autowired     //Injeção de dependência do ProductService
    private ProductService service;

    //CONTROLLER PRA LISTAR TODOS OS PRODUTOS ORDER BY PRICE DESC
    @GetMapping
    public ResponseEntity<List<ProductDTO>> findAllByOrderByPriceDesc() {
        List<ProductDTO> list = service.findAllByOrderByPriceDesc();
        return ResponseEntity.ok().body(list);
    }

    //CONTROLLER PARA INSERIR NOVO PRODUTO
    @PostMapping
    public ResponseEntity<ProductDTO> insert(@RequestBody ProductDTO dto) {
        dto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }




}
