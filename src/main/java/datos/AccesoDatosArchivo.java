package datos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AccesoDatosArchivo implements AccesoDatos<String> {
    private String nombreArchivo;

    public AccesoDatosArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public void abrir() {
        System.out.println("Abriendo archivo: " + nombreArchivo);
    }

    @Override
    public String leer() {
        StringBuilder contenido = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return contenido.toString();
    }

    @Override
    public void cerrar() {
        System.out.println("Cerrando archivo: " + nombreArchivo);
    }
}