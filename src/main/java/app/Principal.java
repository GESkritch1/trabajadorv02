package app;

import datos.AccesoDatos;
import datos.AccesoDatosArchivo;
import trabajador.Trabajador;
import ui.GUI;
import ui.VentanaTrabajador;

public class Principal {
    public static void main(String[] args) {
        // Crear una instancia de Trabajador
        Trabajador trabajador = new Trabajador("Juan", "Pérez", "12345678-9", "BanIsapre", "AFPProvida");

        // Crear una instancia de AccesoDatos para acceder a los datos del trabajador en un archivo
        AccesoDatos<String> accesoDatos = new AccesoDatosArchivo("datos.txt");
        accesoDatos.abrir();
        String datos = accesoDatos.leer();
        accesoDatos.cerrar();

        // Mostrar los datos en la ventana de trabajador
        GUI gui = new VentanaTrabajador(trabajador);
        gui.mostrar();
        gui.interactuar();
    }
}