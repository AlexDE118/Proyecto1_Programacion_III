package logic;

public class Farmaceuta extends Persona {
    //Atributos
    private String clave;
    //Constructores
    Farmaceuta(String nombre, String id, String clave) {
        super(nombre, id);
        this.clave = clave;
    }
    //Setters | Getters
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    //Metodos de la clase

    public String toString() {
        return nombre + " " + id + " " + clave;
    }
}
