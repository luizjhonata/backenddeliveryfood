package com.luizjhonata.backendfooddelivery.services;

import com.luizjhonata.backendfooddelivery.dto.OrderDTO;
import com.luizjhonata.backendfooddelivery.entities.Order;
import com.luizjhonata.backendfooddelivery.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    //Service para mostrar todas as ordens ordenadas por id
    @Transactional(readOnly = true)
    public List<OrderDTO> findAll() {
        List<Order> list = repository.findAll();
        return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
    }

}
