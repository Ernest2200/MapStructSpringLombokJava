package com.sv.spring.boot.mapstruct.lombok.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "product")
public class Product {
    @Id
    private Long id;

    private String name;

    @Column(name = "created_at")
    private LocalDateTime creationDate;

    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
