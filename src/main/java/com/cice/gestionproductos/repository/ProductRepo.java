package com.cice.gestionproductos.repository;


import com.cice.gestionproductos.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository <Product,Long> {
}
