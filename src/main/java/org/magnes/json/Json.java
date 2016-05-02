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
        this.jsonStrin += addString(name) + Json.COLON + addString(value);
    }
    
    public void add(String name, Integer value){
        this.jsonStrin += addString(name) + Json.COLON + value;
    }
    
    public void add(String name, Double value){
        this.jsonStrin += addString(name) + Json.COLON + value;
    }
    
    public void add(String name){
        this.jsonStrin += addString(name) + Json.COLON;
        addNewJson();
    }
    
    public void addNullValue(String name){
        this.jsonStrin += addString(name) + Json.COLON + Json.NULL;
    }

    private void addNewJson(){
        this.jsonStrin += Json.KEY_OBJECT_START;
    }
    
    public void addArrayJson(String name) {
        this.jsonStrin += addString(name) + Json.COLON + Json.KEY_ARRAY_START;
        startJson();
    }
    
    public void endArray(){
        this.jsonStrin += Json.KEY_ARRAY_END;
    }
    
    public void addOtherValue() {
        this.jsonStrin += Json.COMMA;
    }
    
    private String addString(String name){
        return "\"" + name + "\"";
    }
    
    @Override
    public String toString(){
        return jsonStrin;
    }
}
