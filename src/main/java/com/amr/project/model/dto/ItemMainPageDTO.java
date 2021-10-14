package com.amr.project.model.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemMainPageDTO {
    private Long id;
    private String name;
    private BigDecimal price;
    private String description;
    private ImageMainPageDto logo;

}