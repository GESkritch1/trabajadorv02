package datos;

import trabajador.Trabajador;

public class DatosTrabajador implements AccesoDatos<Trabajador> {
    private Trabajador trabajador;

    public DatosTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    @Override
    public void abrir() {
        System.out.println("Accediendo a los datos del trabajador...");
    }

    @Override
    public Trabajador leer() {
        return trabajador;
    }

    @Override
    public void cerrar() {
        System.out.println("Cerrando acceso a los datos del trabajador.");
    }
}