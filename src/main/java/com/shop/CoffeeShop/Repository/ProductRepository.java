package com.shop.CoffeeShop.repository;

import com.shop.CoffeeShop.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByName(String name);
}
