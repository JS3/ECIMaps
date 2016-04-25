package eci.edu.arsw.controllers;

/**
 *
 * @author Juan Sebastian Martinez Serna
 * @author Diana Maria del Pilar Socha Diaz
 */
public class EcimapController {
    
}

//
//@RestController
//@RequestMapping("/blueprints")
//public class BlueprintController {
//    
//    @Autowired
//    ServicesFacade services;
//    
//    
//    @RequestMapping(value="/check",method = RequestMethod.GET)        
//    public String check() {
//        return "REST API OK";        
//    }
//    
//    @RequestMapping(method = RequestMethod.POST)        
//    public ResponseEntity<?> addBlueprint(@RequestBody Blueprint p) {       
//        services.addNewBlueprint(p.getName(),p);
//        return new ResponseEntity<>(HttpStatus.ACCEPTED);
//    }
//
//    
//    @RequestMapping(method = RequestMethod.GET)
//    public Set<String> allBlueprintNames() {       
//        return services.getBlueprintNames();
//    }
//    
//    @RequestMapping(value = "/{blueprintname}",method = RequestMethod.GET)        
//    public Blueprint getABlueprint(@PathVariable("blueprintname") String blueprintname) {       
//        return services.getBlueprintByName(blueprintname);
//    }
//
//    
//    
//    
//    
//}