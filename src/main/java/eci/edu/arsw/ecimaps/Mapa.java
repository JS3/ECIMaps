package eci.edu.arsw.ecimaps;

import eci.edu.arsw.services.Exportar;
import eci.edu.arsw.services.Importar;

/**
 * El mapa esta compuesta por un solo nodo central, y este puede tener
 * una gran cantidad de nojos hijos.
 * 
 * @author Juan Sebastian Martinez Serna
 * @author Diana Maria del Pilar Socha Diaz
 */
public class Mapa implements Exportar, Importar{
    
    private final Nodo nodoCentral;

    public Mapa(Nodo nodo) {
        this.nodoCentral = nodo;
    }
    
    @Override
    public void exportarXML(){
        
    }
    
    @Override
    public void importarXML(){
        
    }
}
