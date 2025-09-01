package hospital.presentacion.farmaceuta;

import hospital.logic.Farmaceuta;
import hospital.presentacion.AbstractModel;

import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class Model extends AbstractModel {
    Farmaceuta currentFarmaceuta;
    List<Farmaceuta> farmaceutas;

    public static final String CURRENT = "currentFarmaceuta";
    public static final String LISTAFARMACEUTAS = "farmaceutas";

    public Model(){
        currentFarmaceuta = new Farmaceuta();
        farmaceutas = new ArrayList<>();
        firePropertyChange(CURRENT);
        firePropertyChange(LISTAFARMACEUTAS);
    }

    public Farmaceuta getCurrentFarmaceuta() {
        return currentFarmaceuta;
    }
    public void setCurrentFarmaceuta(Farmaceuta currentFarmaceuta) {
        this.currentFarmaceuta = currentFarmaceuta;
        firePropertyChange(CURRENT);
    }

    public List<Farmaceuta> getFarmaceutas() {
        return farmaceutas;
    }
    public void setFarmaceutas(List<Farmaceuta> farmaceutas) {
        this.farmaceutas = farmaceutas;
        firePropertyChange(LISTAFARMACEUTAS);
    }
    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener){
        super.addPropertyChangeListener(listener);
        firePropertyChange(CURRENT);
        firePropertyChange(LISTAFARMACEUTAS);
    }
}
