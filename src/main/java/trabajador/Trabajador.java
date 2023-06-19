// Clase Trabajador en el paquete "trabajador"
package trabajador;

public class Trabajador {
    private String nombre;
    private String apellido;
    private String rut;
    private String isapre;
    private String afp;

    public Trabajador(String nombre, String apellido, String rut, String isapre, String afp) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.isapre = isapre;
        this.afp = afp;
    }

    // Getters y setters

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

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getIsapre() {
        return isapre;
    }

    public void setIsapre(String isapre) {
        this.isapre = isapre;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }
}