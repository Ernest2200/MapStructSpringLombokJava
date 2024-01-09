package com.sv.spring.boot.mapstruct.lombok.test;

import com.sv.spring.boot.mapstruct.lombok.dto.GetProduct;
import com.sv.spring.boot.mapstruct.lombok.entity.Product;
import com.sv.spring.boot.mapstruct.lombok.mapper.ProductMapper;
import com.sv.spring.boot.mapstruct.lombok.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.stream.Collectors;

@Configuration
@RequiredArgsConstructor
public class InitDatabase {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Bean
    public CommandLineRunner testProductMapperCommand() {


        return args -> {
            System.out.println("Products");
            List<Product> products = productRepository.findAll();
            products.forEach(System.out::println);
            System.out.println("GET Products");
            List<GetProduct> getProductsList = productMapper.toGetProductList(products);
            getProductsList.forEach(System.out::println);
            System.out.println("MAPPED PRODUCTS");
            List<Product> mappedProducts = productMapper.toEntityList(getProductsList);
            mappedProducts.forEach(System.out::println);
        };
    }


}
