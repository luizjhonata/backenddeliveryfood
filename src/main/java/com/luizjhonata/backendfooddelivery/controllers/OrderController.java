package com.luizjhonata.backendfooddelivery.controllers;

import com.luizjhonata.backendfooddelivery.dto.OrderDTO;
import com.luizjhonata.backendfooddelivery.entities.Order;
import com.luizjhonata.backendfooddelivery.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

    //CONTROLARDOR PARA SALVAR NOVAS ORDENS
    @PostMapping
    public ResponseEntity<OrderDTO> insert(@RequestBody OrderDTO dto) {
        dto = service.insert(dto);
        //Método para retornar 201 ao invés de 200, que é o correto para inserção de recurso
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    //CONTROLARDOR PARA ALTERAR ORDERS PARA ACCEPTED
    @PutMapping(value = "/{id}/accepted")
    public ResponseEntity<OrderDTO> setAccepted(@PathVariable Long id){
        OrderDTO dto = service.setAccepted(id);
        return ResponseEntity.ok().body(dto);
    }

    //CONTROLARDOR PARA ALTERAR ORDERS PARA DELIVERED
    @PutMapping(value = "/{id}/delivered")
    public ResponseEntity<OrderDTO> setDelivered(@PathVariable Long id){
        OrderDTO dto = service.setDelivered(id);
        return ResponseEntity.ok().body(dto);
    }

    //CONTROLARDOR PARA ALTERAR ORDERS PARA CANCELED
    @PutMapping(value = "/{id}/canceled")
    public ResponseEntity<OrderDTO> setCanceled(@PathVariable Long id){
        OrderDTO dto = service.setCanceled(id);
        return ResponseEntity.ok().body(dto);
    }






}
