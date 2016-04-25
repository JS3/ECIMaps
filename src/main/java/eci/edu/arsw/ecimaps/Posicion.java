package eci.edu.arsw.ecimaps;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author Juan Sebastian Martinez Serna
 * @author Diana Maria del Pilar Socha Diaz
 */
public class Posicion {
    
    public static final String ELEMENT_XML = "Posicion";
    public static final String ATTR_X_XML = "x";
    public static final String ATTR_Y_XML = "y";
    
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Posicion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.x;
        hash = 67 * hash + this.y;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Posicion other = (Posicion) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }
    
    public Element toXML(Document document){
        Element element = document.createElement(Posicion.ELEMENT_XML);
        
        Attr attrX = document.createAttribute(Posicion.ATTR_X_XML);
        attrX.setValue(String.valueOf(this.getX()));
        element.setAttributeNode(attrX);
        
        Attr attrY = document.createAttribute(Posicion.ATTR_Y_XML);
        attrY.setValue(String.valueOf(this.getY()));
        element.setAttributeNode(attrY);
        
        return element;
    }
    
}
