package eci.edu.arsw.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Juan Sebastian Martinez Serna
 * @author Diana Maria del Pilar Socha Diaz
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception{
    
}
