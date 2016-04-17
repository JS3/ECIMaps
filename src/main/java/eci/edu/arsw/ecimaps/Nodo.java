package eci.edu.arsw.ecimaps;

import java.util.LinkedList;

/**
 *
 * @author Juan Sebastian Martinez Serna
 * @author Diana Maria del Pilar Socha Diaz
 */
public class Nodo {
    
    private String nombre;
    private String descripcion;
    private Posicion posicion;
    private final LinkedList<Nodo> nodosHijos;

    public Nodo(String nombre, Posicion posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.nodosHijos = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

}
