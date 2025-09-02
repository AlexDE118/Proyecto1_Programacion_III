package hospital.presentacion.paciente;

import hospital.logic.Doctor;
import hospital.presentacion.AbstractModel;
import hospital.logic.Paciente;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class Model extends AbstractModel {
    Paciente current;
    List<Paciente> listaPacientes;

    public static final String CURRENT = "Current";
    public static final String LISTAPACIENTES = "listaPacientes";

    public Model() {
        current = new Paciente();
        listaPacientes = new ArrayList<>();
    }

    public Paciente getCurrent() {
        return current;
    }

    public void setCurrent(Paciente current) {
        this.current = current;
        firePropertyChange(CURRENT);
    }

    public List<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(List<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
        //firePropertyChange(CURRENT);
        firePropertyChange(LISTAPACIENTES);
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        super.addPropertyChangeListener(listener);
        firePropertyChange(CURRENT);
        firePropertyChange(LISTAPACIENTES);
    }
}
