package org.example;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private ArrayList<Libro> libros;
    private String nombreBiblioteca;
    private String direccionBiblioteca;

    public Biblioteca(ArrayList<Libro> libros, String nombreBiblioteca, String direccionBiblioteca){
        this.libros = libros;
        this.nombreBiblioteca = nombreBiblioteca;
        this.direccionBiblioteca = direccionBiblioteca;
    }

    public List<Libro> getLibros() {
        return this.libros;
    }

    public String getNombreBiblioteca(){
        return this.nombreBiblioteca;
    }

    public String getDireccionBiblioteca(){
        return this.direccionBiblioteca;
    }

    public void setLibros(ArrayList<Libro> libros){
        this.libros = libros;
    }

    public void setNombreBiblioteca(String nombreBiblioteca){
        this.nombreBiblioteca = nombreBiblioteca;
    }

    public void setDireccionBiblioteca(String direccionBiblioteca){
        this.direccionBiblioteca = direccionBiblioteca;
    }
}

