package org.magnes.json;

/**
 *
 * @author Juan Sebastian Martinez Serna
 * @author Diana Maria del Pilar Socha Diaz
 */
public class Json {
    
    // OBJECTS KEYS
    public static final String KEY_OBJECT_START = "{ ";
    public static final String KEY_OBJECT_END = " }";
    
    // ARRAYS KEYS
    public static final String KEY_ARRAY_START = "[ ";
    public static final String KEY_ARRAY_END = " ] ";
    
    public static final String COLON = " : ";
    public static final String COMMA = " , ";
    
    private String jsonStrin;

    public Json() {
        this.jsonStrin = Json.KEY_OBJECT_START;
    }

    public void endhJson() { this.jsonStrin += Json.KEY_OBJECT_END; }
    
    public void add(String name, String value) {
        firstValue();
        if (value != null){
            this.jsonStrin += name + Json.COLON + "\"" + value + "\"";
        } else {
            addNullValue(name);
        }
    }
    
    public void add(String name, Integer value){
        firstValue();
        this.jsonStrin += name + Json.COLON + value;
    }
    
    public void add(String name, Double value){
        firstValue();
        this.jsonStrin += name + Json.COLON + value;
    }
    
    public void addNullValue(String name){
        firstValue();
        this.jsonStrin += name + Json.COLON + "null";
    }

    public void addNewJson(){
        this.jsonStrin += Json.KEY_OBJECT_START;
    }
    
    private void firstValue() {
        if (!this.jsonStrin.equalsIgnoreCase(Json.KEY_OBJECT_START)){
            this.jsonStrin += Json.COMMA;
        } else {
            ;
        }
    }
    
    @Override
    public String toString(){
        return jsonStrin;
    }
}
