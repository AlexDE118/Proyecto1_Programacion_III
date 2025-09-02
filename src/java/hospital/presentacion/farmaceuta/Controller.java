package hospital.presentacion.farmaceuta;

import hospital.logic.Farmaceuta;
import hospital.logic.Service;

public class Controller {
    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
        view.setController(this);
        view.setModel(model);
        model.setFarmaceutas(Service.instance().loadListaFarmaceutas());
    }

    public void readFarmaceutas(String ID) throws Exception {
        Farmaceuta farmaceuta = new Farmaceuta();
        farmaceuta.setId(ID);
        model.setCurrentFarmaceuta(Service.instance().readFarmaceuta(farmaceuta));
    }

    public void createFarmaceuta(Farmaceuta farmaceuta) throws Exception {
        Farmaceuta e = new Farmaceuta();
        Service.instance().createFarmaceuta(e);
    }

    public void loadFarmaceutas() {
        model.setFarmaceutas(Service.instance().loadListaFarmaceutas());
    }
}
