package com.cice.gestionproductos.service.impl;

import com.cice.gestionproductos.model.dto.ProductCreateDto;
import com.cice.gestionproductos.model.entity.Product;
import com.cice.gestionproductos.repository.ProductRepo;
import com.cice.gestionproductos.service.IProductService;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired private Mapper mapper;
    @Autowired private ProductRepo productRepo;

    @Override
    public void create(ProductCreateDto productDto) {

        Product product = mapper.map(productDto,Product.class);
        productRepo.save(product);

    }


//    @Override
//    public void create(ProductCreateDto productDto) {



//    }
}
