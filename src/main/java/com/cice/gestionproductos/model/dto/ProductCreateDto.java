package com.cice.gestionproductos.model.dto;

import javax.validation.constraints.NotNull;

public class ProductCreateDto {

    @NotNull
    private String name;
    @NotNull
    private String description;
    private long stock;
    private long price;
    @NotNull
    private String img;

    public ProductCreateDto() { }


}
