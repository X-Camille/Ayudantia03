package org.example;

import gestorDatos.GestorDatos;
import gestorDatos.GestorPDF;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // PROBANDO GESTIÓN DE DATOS
        Biblioteca biblioteca = new Biblioteca("Biblioteca UFRO", "Uruguay");
        GestorDatos gestor = new GestorDatos();
        Libro libro = new Libro("El túnel", "Ernesto Sábato", "Sur");
        gestor.registrarDato(libro, "C:/Users/Lenovo/Desktop/biblioteca.txt");
        gestor.leerArchivo("C:/Users/Lenovo/Desktop/biblioteca.txt");

        // CREAR PDF A PARTIR DE LOS DATOS DE UN LIBRO
        GestorPDF gestorPDF = new GestorPDF();
        gestorPDF.generarArchivoPDF(libro);
    }
}
