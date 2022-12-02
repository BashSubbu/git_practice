package com.ensat.repositories;

import com.ensat.entities.Product;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    // for getting product information using Id
    Product geProduct(int id);

}
