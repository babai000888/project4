package com.amr.project.model.dto;

import com.amr.project.model.entity.Country;
import lombok.Data;

@Data
public class AdminCityDto {
    private Long id;
    private String name;
    private CountryDto country;
}
