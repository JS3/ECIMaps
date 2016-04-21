package eci.edu.arsw.ecimaps;

import java.util.HashMap;

/**
 *
 * @author Juan Sebastian Martinez Serna
 * @author Diana Maria del Pilar Socha Diaz
 */
public class Nodo {
    
    private String nombre;
    private String descripcion;
    private Posicion posicion;
    private final int idNodo;
    private int numeroHijos;
    private final HashMap<Integer, Nodo> nodosHijos;

    public Nodo(String nombre, Posicion posicion, int idNodo) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.nodosHijos = new HashMap<>();
        this.numeroHijos = 0;
        this.idNodo = idNodo;
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

    public int getIdNodo() {
        return idNodo;
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }
    
    public void agregarNodoHijo(Nodo nodo) {
        this.numeroHijos++;
    }
    
    public void eliminarNodoHijo(int idNodoHijo) {
        
    }
}
