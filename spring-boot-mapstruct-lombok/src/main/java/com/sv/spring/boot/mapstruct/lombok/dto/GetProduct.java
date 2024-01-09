package com.sv.spring.boot.mapstruct.lombok.dto;

import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetProduct {
    @Id
    private Long productId;
    private String productName;
    private String creationDate;
    private  GetCategory productCategory;
    private String price;
}
