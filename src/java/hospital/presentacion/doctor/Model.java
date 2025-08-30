package hospital.presentacion.doctor;

import hospital.logic.Doctor;
import hospital.presentacion.AbstractModel;

import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class Model extends AbstractModel{//aa
    Doctor current;
    List<Doctor> listaDoctores;

    public static final String CURRENT = "Current";
    public static final String LISTADOCTORES = "listaDoctores";

    public Model() {
        current = new Doctor();
        listaDoctores = new ArrayList<>();
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener){
        super.addPropertyChangeListener(listener);
        firePropertyChange(CURRENT);
        firePropertyChange(LISTADOCTORES);
    }

    public Doctor getCurrent() {
        return current;
    }

    public void setCurrent(Doctor current) {
        this.current = current;
        firePropertyChange(CURRENT);
    }

    public List<Doctor> getListaDoctores() {
        return listaDoctores;
    }

    public void setListaDoctores(List<Doctor> listaDoctores) {
        this.listaDoctores = listaDoctores;
        firePropertyChange(LISTADOCTORES);
    }

    public void addDoctor(Doctor doctor) {
        listaDoctores.add(doctor);
        firePropertyChange(LISTADOCTORES);
        }
}

