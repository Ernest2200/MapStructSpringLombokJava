package com.sv.spring.boot.mapstruct.lombok.mapper;

import com.sv.spring.boot.mapstruct.lombok.dto.GetProduct;
import com.sv.spring.boot.mapstruct.lombok.entity.Product;
import org.mapstruct.*;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,uses = {CategoryMapper.class})
public interface ProductMapper {

    @Mappings({
            @Mapping(source = "creationDate",target ="creationDate",dateFormat = "yyyy-MM-dd HH-mm-ss"),
            @Mapping(source = "name",target = "productName"),
            @Mapping(source = "id",target = "productId"),
            @Mapping(source = "category",target = "productCategory"),
            @Mapping(source = "price",target = "price",numberFormat = "$0.00")

    })

    GetProduct ToGetDTO(Product product);


    //mapeo inverso

    @InheritInverseConfiguration
   /*
   ignorar campos
    @Mappings({
            @Mapping(target = "creationDate",ignore = true)
    })

    */

    Product toEntity(GetProduct getProduct);

    List<GetProduct> toGetProductList(List<Product> productList);
    List<Product> toEntityList(List<GetProduct> getProductList);
}
