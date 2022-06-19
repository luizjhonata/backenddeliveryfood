package com.luizjhonata.backendfooddelivery.repositories;

import com.luizjhonata.backendfooddelivery.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query("SELECT DISTINCT obj FROM Order obj JOIN FETCH obj.products " +
            "WHERE obj.status = 0 ORDER BY obj.moment ASC")
    List<Order> findPendingOrders();

    @Query("SELECT DISTINCT obj FROM Order obj JOIN FETCH obj.products " +
            "WHERE obj.status = 1 ORDER BY obj.moment ASC")
    List<Order> findAcceptedOrders();

    @Query("SELECT DISTINCT obj FROM Order obj JOIN FETCH obj.products " +
            "WHERE obj.status = 2 ORDER BY obj.moment ASC")
    List<Order> findDeliveredOrders();

    @Query("SELECT DISTINCT obj FROM Order obj JOIN FETCH obj.products " +
            "WHERE obj.status = 3 ORDER BY obj.moment ASC")
    List<Order> findCanceledOrders();

}
