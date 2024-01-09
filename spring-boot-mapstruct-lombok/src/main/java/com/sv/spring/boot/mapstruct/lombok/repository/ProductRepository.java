package com.sv.spring.boot.mapstruct.lombok.repository;

import com.sv.spring.boot.mapstruct.lombok.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
