package com.example.demo.demoSpring.dao;

import com.example.demo.demoSpring.model.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductosDao extends CrudRepository<Producto, Long>{
    
}
