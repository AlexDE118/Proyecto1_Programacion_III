package hospital.presentacion.paciente;

import hospital.logic.Paciente;
import hospital.logic.Service;

public class Controller {
    View view;
    Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
        view.setController(this);
        view.setModel(model);
    }

    public void readPacientes(String id) throws Exception{
        Paciente paciente = new Paciente();
        paciente.setId(id);
        model.setCurrent(Service.instance().readPaciente(paciente));
    }

    public void createPaciente(Paciente paciente) throws Exception{
        //Paciente paciente = new Paciente();
        Service.instance().createPaciente(paciente);
    }

    public void loadPacientes() { model.setListaPacientes(Service.instance().loadListaPacientes()); }

    public void deletePaciente(String id) throws Exception{
        Paciente paciente = new Paciente();
        paciente.setId(id);

        // Elimina Paciente
    }
}
