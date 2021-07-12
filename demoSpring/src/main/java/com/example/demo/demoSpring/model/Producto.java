package com.example.demo.demoSpring.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "productos")
public class Producto implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private Double precio;
    private Integer cantidad;
    
    @Override
    public String toString(){
        return "{ id: " + id + " nombre: " + nombre + " precio: " + precio + " cantidad: " + cantidad + " descripcion: " + descripcion + " }";
    }
}
