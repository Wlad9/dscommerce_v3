package com.desafio5.dscommer_v3.repositories;

import com.desafio5.dscommer_v3.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
    
}
