package com.proyect.POO.model;

import jakarta.persistence.*;

@Entity 
@Table(name = "usuarios") 
public class Usuarios { 

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 

    private Long id;

    private String nombre;
    private String correo;
    // Constructor 
    public Usuarios() {} // Constructor vacío, necesario para que JPA pueda crear instancias de la entidad.

// Esto borrar el constructor vacío y crear uno que reciba los atributos de la clase,
//  para poder crear un usuario con nombre y correo.
    public Usuarios(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;

    }
    // Getters and Setters
    // En Java, los getters y setters son métodos que permiten leer (get) 
    // y modificar (set) de forma controlada los atributos privados de una clase. 
    // Sin acceder dirrectamente a ellos, lo que ayuda a mantener la encapsulación y la integridad de los datos.
   
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getCorreo(){
        return correo;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }
}
