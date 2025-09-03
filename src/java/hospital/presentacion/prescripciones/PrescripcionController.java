package hospital.presentacion.prescripciones;

import hospital.logic.Medicamento;
import hospital.logic.Prescripcion;
import hospital.logic.Service;

public class PrescripcionController {
    PrescripcionView view;
    PrescripcionModel model;

    public PrescripcionController(PrescripcionView view, PrescripcionModel model){
        this.view = view;
        this.model = model;
        view.setController(this);
        view.setModel(model);
    }

    public void addMedicinaRectea(Medicamento med){

    }



    public void searchPaciente(String id) {

    }
}
