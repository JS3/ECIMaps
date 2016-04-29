package eci.edu.arsw.services;

/**
 *
 * @author Juan Sebastian Martinez Serna
 * @author Diana Maria del Pilar Socha Diaz
 */
public interface Exportar {
    
    /**
     * Genera un archivo XML con la configuracion del mapa mental
     * @param path nombre del archivo con su ruta
     */
    public void exportarXML(String path);
    
    /**
     * Genera un archivo JSON con la configuracion del mapa mental
     * @param path nombre del archivo con su ruta
     */
    public void exportarJSON(String path);
}
