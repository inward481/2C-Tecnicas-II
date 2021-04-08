package cinema;

public class Persona {
    
    private  int id;
    private String nombre;

    public void Persona(int id, String nombre) {
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
