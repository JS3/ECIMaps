package org.magnes.json;

/**
 *
 * @author Juan Sebastian Martinez Serna
 * @author Diana Maria del Pilar Socha Diaz
 */
public class Json {
    
    // OBJECTS KEYS
    public static final String KEY_OBJECT_START = "{";
    public static final String KEY_OBJECT_END = "}";
    
    // ARRAYS KEYS
    public static final String KEY_ARRAY_START = "[";
    public static final String KEY_ARRAY_END = "]";
    
    public static final String COLON = ":";
    public static final String COMMA = ",";
    public static final String NULL = "null";
    
    private String jsonStrin;

    public Json() {
        this.jsonStrin = Json.KEY_OBJECT_START;
    }

    public void startJson() {this.jsonStrin += Json.KEY_OBJECT_START;}
    public void endhJson() { this.jsonStrin += Json.KEY_OBJECT_END; }
    
    public void add(String name, String value) {
        firstValue();
        this.jsonStrin += name + Json.COLON + "\"" + value + "\"";
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
        this.jsonStrin += name + Json.COLON + Json.NULL;
    }

    public void addNewJson(){
        firstValue();
        this.jsonStrin += Json.KEY_OBJECT_START;
    }
    
    public void addArrayJson(String name) {
        this.jsonStrin += name + Json.COLON + Json.KEY_ARRAY_START;
        startJson();
    }
    
    public void endArray(){
        this.jsonStrin += Json.KEY_ARRAY_END;
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
