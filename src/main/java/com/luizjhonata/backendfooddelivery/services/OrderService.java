package com.luizjhonata.backendfooddelivery.services;

import com.luizjhonata.backendfooddelivery.dto.OrderDTO;
import com.luizjhonata.backendfooddelivery.dto.ProductDTO;
import com.luizjhonata.backendfooddelivery.entities.Order;
import com.luizjhonata.backendfooddelivery.entities.OrderStatus;
import com.luizjhonata.backendfooddelivery.entities.Product;
import com.luizjhonata.backendfooddelivery.repositories.OrderRepository;
import com.luizjhonata.backendfooddelivery.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Autowired
    private ProductRepository productRepository;

    //Service para mostrar todas as ordens ordenadas por id
    @Transactional(readOnly = true)
    public List<OrderDTO> findAll() {
        List<Order> list = repository.findAll();
        return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
    }

    //Service para mostrar todas as ordens pendentes ordenada por moment
    @Transactional(readOnly = true)
    public List<OrderDTO> findPendingOrders() {
        List<Order> list = repository.findPendingOrders();
        return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
    }

    //Service para mostrar todas as ordens aceitas ordenada por moment
    @Transactional(readOnly = true)
    public List<OrderDTO> findAcceptedOrders() {
        List<Order> list = repository.findAcceptedOrders();
        return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
    }

    //Service para mostrar todas as ordens entregues ordenada por moment
    @Transactional(readOnly = true)
    public List<OrderDTO> findDeliveredOrders() {
        List<Order> list = repository.findDeliveredOrders();
        return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
    }

    //Service para mostrar todas as ordens canceladas ordenada por moment
    @Transactional(readOnly = true)
    public List<OrderDTO> findCanceledOrders() {
        List<Order> list = repository.findCanceledOrders();
        return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
    }

    //Service para salvar novas ordens
    @Transactional
    public OrderDTO insert(OrderDTO dto) {
        //Instanciando uma nova ordem
        Order order = new Order(null, dto.getName(), dto.getPhoneNumber(), dto.getAddress(), Instant.now(),
                OrderStatus.PENDING);
        //Instanciando os produtos da ordem
        for (ProductDTO p : dto.getProducts()) {
            Product product = productRepository.getReferenceById(p.getId());
            order.getProducts().add(product);
        }
        order = repository.save(order);
        return new OrderDTO(order);
    }


}
