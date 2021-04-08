package cinema;

public class Persona {
    
    int id;
    String nombre;

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public String DarNombre(){
        return this.nombre;
    }
    
    public int DarId(){
        return this.id;
    }
}
