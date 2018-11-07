package com.cice.gestionproductos.controller;


import com.cice.gestionproductos.model.dto.ProductCreateDto;
import com.cice.gestionproductos.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import javax.xml.ws.Response;

@Controller("product")
public class ProductController {

    @Autowired private IProductService productService;

    @PostMapping
    public ResponseEntity create(@Valid ProductCreateDto productCreateDto, Errors errors){

        if(errors.hasErrors()){
            throw new IllegalArgumentException("Parametros incorrectos");
        }

        productService.create(productCreateDto);
        return new ResponseEntity(HttpStatus.OK);
    }

}
