package logic;

public class Medicamento {
    //Atributos
    private String ID;
    private String nombre;
    private int presentacion;

    //Constructores

    Medicamento(String ID, String nombre, int presentacion) {
        this.ID = ID;
        this.nombre = nombre;
        this.presentacion = presentacion;
    }

    //Setters | Getters

    public String getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPresentacion() {
        return presentacion;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPresentacion(int presentacion) {
        this.presentacion = presentacion;
    }
    //Metodos de la clase

    public String toString() {
        return ID + " " + nombre + " " + presentacion;
    }
}
