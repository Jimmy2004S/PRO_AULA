

package proaula.clases;


import java.util.*;



public class Pelicula {
    private String nombre;
    List<Personaje> personaje;
    private Date fechaLanzamiento;
    private String duracion;
    private double precioEntrada;
    private String genero;

    public Pelicula(String nombre, List<Personaje> personaje, Date fechaLanzamiento, String duracion, double precioEntrada, String genero) {
        this.nombre = nombre;
        this.personaje = personaje;
        this.fechaLanzamiento = fechaLanzamiento;
        this.duracion = duracion;
        this.precioEntrada = precioEntrada;
        this.genero = genero;
    }

    public List<Personaje> getPersonaje() {
        return personaje;
    }

    public Pelicula() {
    }

    public void setPersonaje(List<Personaje> personaje) {
        this.personaje = personaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
}
