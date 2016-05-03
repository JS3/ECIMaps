package eci.edu.arsw.services;

/**
 *
 * @author Juan Sebastian Martinez Serna
 * @author Diana Maria del Pilar Socha Diaz
 */
public class FachadaServicio {
    
    
    private FachadaServicio() {
    }
    
    public static FachadaServicio getInstance() {
        return FachadaServicioHolder.INSTANCE;
    }
    
    private static class FachadaServicioHolder {

        private static final FachadaServicio INSTANCE = new FachadaServicio();
    }
    
    
}
