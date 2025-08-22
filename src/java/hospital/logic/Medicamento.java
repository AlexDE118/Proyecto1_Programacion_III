package hospital.logic;

public class Medicamento {
    //Atributos
    private String ID;
    private String nombre;
    private float presentacion;

    //Constructores

    public Medicamento() {
        this.ID = "";
        this.nombre = "";
        this.presentacion = 0;
    }

    public Medicamento(String ID, String nombre, float presentacion) {
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

    public float getPresentacion() {
        return presentacion;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPresentacion(float presentacion) {
        this.presentacion = presentacion;
    }
    //Metodos de la clase

    public String toString() {
        return ID + " " + nombre + " " + presentacion;
    }
}
