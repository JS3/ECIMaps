package eci.edu.arsw.services;

/**
 *
 * @author Juan Sebastian Martinez Serna
 * @author Diana Maria del Pilar Socha Diaz
 */
public interface Importar {
    
    /**
     * 
     * @param path 
     */
    public void importarXML(String path);
    
    public void importatJSON(String path);
}
