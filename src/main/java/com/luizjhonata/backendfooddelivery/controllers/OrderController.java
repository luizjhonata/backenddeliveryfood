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

    //CONTROLADOR PARA MOSTRAR TODAS AS ORDENS PENDENTES POR MOMENT
    @GetMapping("0")
    public ResponseEntity<List<OrderDTO>> findPendingOrders() {
        List<OrderDTO> list = service.findPendingOrders();
        return ResponseEntity.ok().body(list);
    }

    //CONTROLADOR PARA MOSTRAR TODAS AS ORDENS ACEITAS POR MOMENT
    @GetMapping("1")
    public ResponseEntity<List<OrderDTO>> findAcceptedOrders() {
        List<OrderDTO> list = service.findAcceptedOrders();
        return ResponseEntity.ok().body(list);
    }

    //CONTROLADOR PARA MOSTRAR TODAS AS ORDENS ACEITAS POR MOMENT
    @GetMapping("2")
    public ResponseEntity<List<OrderDTO>> findDeliveredOrders() {
        List<OrderDTO> list = service.findDeliveredOrders();
        return ResponseEntity.ok().body(list);
    }

    //CONTROLADOR PARA MOSTRAR TODAS AS ORDENS CANCELADAS POR MOMENT
    @GetMapping("3")
    public ResponseEntity<List<OrderDTO>> findCanceledOrders() {
        List<OrderDTO> list = service.findCanceledOrders();
        return ResponseEntity.ok().body(list);
    }









}
