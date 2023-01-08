/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PAQUETE_Clases;

/**
 *
 * @author xaenp
 */
public class Libro {
    
    
    private int id;
    private String nombre;
    private float precio;
    private String genero;
    private int anio;
    private String autor;
    
    
    public Libro (int nuevoId, String nuevoNombre, float nuevoPrecio, String nuevoGenero, int nuevoAnio, String nuevoAutor ){
           id = nuevoId;
           nombre = nuevoNombre;
           precio = nuevoPrecio;
           genero = nuevoGenero;
           anio = nuevoAnio;
           autor = nuevoAutor;
           
           
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnio() {
        return anio;
    }

    public String getAutor() {
        return autor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
    
    
    
}
