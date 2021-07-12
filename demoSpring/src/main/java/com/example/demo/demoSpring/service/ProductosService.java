package com.example.demo.demoSpring.service;

import com.example.demo.demoSpring.model.Producto;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.demoSpring.dao.ProductosDao;

@Service
@Slf4j
public class ProductosService {
    
    
    @Autowired
    private ProductosDao daoPersona;
    
    
    public List<Producto> getAll(){
        log.info("Obteniendo un listado de productos");
        return (List<Producto>) daoPersona.findAll();
    }
    
    public void guardarPersona(Producto p){
        log.info("Almacenando producto: " + p.toString());
        daoPersona.save(p);
    }
    
    public Producto getById(Long id){
        log.info("Obteniendo el producto con id: " + id);
        return (Producto) daoPersona.findById(id).orElse(null);
    }
}
