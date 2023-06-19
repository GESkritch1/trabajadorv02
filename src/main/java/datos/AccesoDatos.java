package datos;

public interface AccesoDatos<T> {
    void abrir();

    T leer();

    void cerrar();
}