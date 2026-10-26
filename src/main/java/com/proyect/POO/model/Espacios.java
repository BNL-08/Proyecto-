package com.proyect.POO.model;
import jakarta.persistence.*;

@Entity 
@Inheritance (strategy = InheritanceType.JOINED)
@Table (name = "espacios")
public abstract class Espacios {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String capacidad; 

    public Espacios() {}
    public Espacios(String nombre, String capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
}

