package eci.edu.arsw.ecimaps;

import java.util.HashMap;
import java.util.Map;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author Juan Sebastian Martinez Serna
 * @author Diana Maria del Pilar Socha Diaz
 */
public class Nodo {
    
    public static final String ELEMENT_XML = "Nodo";
    public static final String ATTR_NOMBRE_XML = "nombre";
    public static final String ATTR_DESCRIPCION_XML = "descripcion";
    
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
    
    public Element toXML(Document document){
        Element root = document.createElement(Nodo.ELEMENT_XML);
        
        Attr attrNombre = document.createAttribute(Nodo.ATTR_NOMBRE_XML);
        attrNombre.setValue(this.getNombre());
        root.setAttributeNode(attrNombre);
        
        Attr attrDescripcion = document.createAttribute(Nodo.ATTR_DESCRIPCION_XML);
        attrDescripcion.setValue(this.getDescripcion());
        root.setAttributeNode(attrDescripcion);
        
        Element ePosicion = this.getPosicion().toXML(document);
        
        root.appendChild(ePosicion);
        
        for (Map.Entry<Integer, Nodo> entry : nodosHijos.entrySet()) {
            Nodo value = entry.getValue();
            Element eHijo = value.toXML(document);
            root.appendChild(eHijo);
        }
        
        return root;
    }
}
