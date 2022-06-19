package com.luizjhonata.backendfooddelivery.controllers;

import com.luizjhonata.backendfooddelivery.dto.OrderDTO;
import com.luizjhonata.backendfooddelivery.entities.Order;
import com.luizjhonata.backendfooddelivery.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "orders")
public class OrderController {

    @Autowired
    private OrderService service;


    //CONTROLADOR PARA MOSTRAR TODAS AS ORDENS ORDENADAS POR ID
    @GetMapping
    public ResponseEntity<List<OrderDTO>> findAll() {
        List<OrderDTO> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }



}
