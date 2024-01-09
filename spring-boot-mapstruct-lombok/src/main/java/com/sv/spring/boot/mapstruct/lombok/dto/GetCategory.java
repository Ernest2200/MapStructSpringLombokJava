package com.sv.spring.boot.mapstruct.lombok.dto;

import jakarta.persistence.Id;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetCategory {
    @Id
    private Long categoryId;
    private String categoryName;

}
