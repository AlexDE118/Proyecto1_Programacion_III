package hospital.logic;
import hospital.logic.Medicamento;

import java.util.ArrayList;
import java.util.List;

public class Receta {
    List<Medicamento> medicamentos;
    int cantidad;
    int duracion;
    String indicaciones;
//  Fecha va aqui

    public Receta(){
        medicamentos = new ArrayList<>();
        cantidad = 0;
        duracion = 0;
        indicaciones = "";
    }

    public Receta(int cantidad, int duracion, String indicaciones){
        medicamentos = new ArrayList<>();
        this.cantidad = cantidad;
        this.duracion = duracion;
        this.indicaciones = indicaciones;
    }

    public List<Medicamento> getMedicamentos(){
        return medicamentos;
    }
    public void setMedicamentos(List<Medicamento> medicamentos){
        this.medicamentos = medicamentos;
    }

    public int getCantidad(){
        return cantidad;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    public int getDuracion(){
        return duracion;
    }

    public void setDuracion(int duracion){
        this.duracion = duracion;
    }

    public String getIndicaciones(){
        return indicaciones;
    }
    public void setIndicaciones(String indicaciones){
        this.indicaciones = indicaciones;
    }

    public void agregarMedicamento(Medicamento medicamento){
        medicamentos.add(medicamento);
    }

    public Medicamento obtenerMedicamentoDeReceta(String id){
        for(Medicamento med : medicamentos){
            if(med.getID().equals(id)){
                return med;
            }
        }
        return null;
    }

    public void eliminarMedicamento(Medicamento medicamento){
        medicamentos.remove(medicamento);
    }

}
