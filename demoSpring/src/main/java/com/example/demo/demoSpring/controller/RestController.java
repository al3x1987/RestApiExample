package com.example.demo.demoSpring.controller;

import com.example.demo.demoSpring.model.Producto;
import com.example.demo.demoSpring.service.ProductosService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
@Slf4j
public class RestController {
    
    @Autowired
    private ProductosService service;
    
    @GetMapping("/listar")
    public List<Producto> listar(){
        log.info("Entrando en controller rest");
        return service.getAll();
    }
    
    @PostMapping("/insertar")
    public void insertar(@RequestBody Producto p){
        log.info("Entrando en controller rest");
        service.guardarPersona(p);
    }
    
    @GetMapping("/find/{id}")
    public Producto find(@PathVariable Long id){
        log.info("Entrando en controller rest");
        return service.getById(id);
    }
}
