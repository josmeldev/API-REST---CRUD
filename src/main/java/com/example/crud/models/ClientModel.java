package com.example.crud.models;


import jakarta.persistence.*;

@Entity
@Table (name = "Client")
public class ClientModel {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long Id;

    private String nombre;
    private String apellido;
    private int edad;
    private String ciudad;

    public ClientModel(){

    }

    public ClientModel(Long id, String nombre, String apellido, int edad, String ciudad) {
        Id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
