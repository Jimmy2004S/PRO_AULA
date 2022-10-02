

package proaula.clases;

import java.util.*;



public class Sala {
    private Pelicula pelicula;

    public Sala(Pelicula pelicula, int numeroSillas, List<Cliente> clientes) {
        this.pelicula = pelicula;
        this.numeroSillas = numeroSillas;
        this.clientes = clientes;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public int getNumeroSillas() {
        return numeroSillas;
    }

    public void setNumeroSillas(int numeroSillas) {
        this.numeroSillas = numeroSillas;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    private int numeroSillas;
    List<Cliente> clientes;
}
