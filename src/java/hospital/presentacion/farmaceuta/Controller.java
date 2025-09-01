package hospital.presentacion.farmaceuta;

import hospital.logic.Farmaceuta;
import hospital.logic.Service;

public class Controller {
    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
        //view.setController(this);
        //view.setModel(model);
    }



}
