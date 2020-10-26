package com.pizzabff.projectbackend.repository;


import com.pizzabff.projectbackend.model.PizzaOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PizzaOrdersRepository extends JpaRepository<PizzaOrder, Long> {
    List<PizzaOrder> getPizzaOrdersByHolderName(String holderName);
}
