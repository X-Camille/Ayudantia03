package gestorDatos;

import jdk.internal.icu.text.UTF16;
import org.example.Biblioteca;
import org.example.Libro;

import java.io.*;

public class GestorDatos {
    public static void leerArchivo(String direccionArchivo) {
        String textoArchivo = "";
        String[] data = new String[0];
        try {
            File archivo = new File(direccionArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            while ((textoArchivo = br.readLine()) != null) {
                data = textoArchivo.split(",");
            }
            for (String item : data) {
                System.out.println(item);
            }
        } catch (Exception e) {
            System.out.println("Documento no disponible, favor contactar con administrador");
        }
    }

    public static boolean registrarDato(Object objeto, String direccionArchivo) {
        boolean lineaVacia=false;
        try {
            File file = new File(direccionArchivo);
            if (!file.exists()) {
                lineaVacia=true;
            }
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);

            if(!lineaVacia){
                bw.newLine();
            }
            bw.write(objeto.toString());
            bw.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error al ingresar dato, favor contactar con administrador");
            return false;
        }
    }

}
