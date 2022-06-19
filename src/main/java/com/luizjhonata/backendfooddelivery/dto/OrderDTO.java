package com.luizjhonata.backendfooddelivery.dto;

import com.luizjhonata.backendfooddelivery.entities.Order;
import com.luizjhonata.backendfooddelivery.entities.OrderStatus;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderDTO {

    private Long id;

    private String name;

    private String phoneNumber;

    private String address;

    private Instant moment;

    private OrderStatus status;

    private List<ProductDTO> products = new ArrayList<>();

    public OrderDTO() {
    }

    public OrderDTO(Long id, String name, String phoneNumber, String address, Instant moment, OrderStatus status) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.moment = moment;
        this.status = status;
    }

    public OrderDTO(Order entity) {
        id = entity.getId();
        name = entity.getName();
        phoneNumber = entity.getPhoneNumber();
        address = entity.getAddress();
        moment = entity.getMoment();
        status = entity.getStatus();
        products = entity.getProducts().stream()
                .map(x -> new ProductDTO(x)).collect(Collectors.toList());

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<ProductDTO> getProducts() {
        return products;
    }


}
