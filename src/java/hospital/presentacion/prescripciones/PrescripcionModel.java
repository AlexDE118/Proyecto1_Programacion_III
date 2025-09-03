package hospital.presentacion.prescripciones;

import hospital.logic.Prescripcion;
import hospital.logic.Medicamento;
import hospital.logic.Receta;
import hospital.presentacion.AbstractModel;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class PrescripcionModel extends AbstractModel {
    Prescripcion current;
    List<Receta> recetas;
    List<Medicamento> medicamentos;

    public PrescripcionModel(){
        current = new Prescripcion();
        recetas = new ArrayList<Receta>();
        medicamentos = new ArrayList<Medicamento>();
    }

    public static final String CURRENT = "current";
    public static final String LISTARECETA = "recetas";
    public static final String PACIENTE = "Paciente";
    public static final String LISTAPACIENTE = "pacientes";

    @Override

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        super.addPropertyChangeListener(listener);
        firePropertyChange(CURRENT);
        firePropertyChange(LISTARECETA);
        firePropertyChange(PACIENTE);
        firePropertyChange(LISTAPACIENTE);
    }

    public void setCurrent(Prescripcion current){
        this.current = current;
        this.firePropertyChange(CURRENT);
        firePropertyChange(PACIENTE);
    }

    public Prescripcion getCurrent(){
        return current;
    }

    public void setRecetas(List<Receta> recetas){
        this.recetas = recetas;
        this.firePropertyChange(LISTARECETA);
    }

    public List<Receta> getRecetas(){
        return recetas;
    }



}
