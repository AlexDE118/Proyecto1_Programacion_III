package hospital;

import hospital.presentacion.doctor.Controller;
import hospital.presentacion.doctor.Model;
import hospital.presentacion.doctor.View;
import hospital.presentacion.medicamentos.MedicamentosController;
import hospital.presentacion.medicamentos.MedicamentosModel;
import hospital.presentacion.medicamentos.ViewMedicamentos;


import javax.swing.*;

public class Application {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ex) { ex.printStackTrace();}

        MedicamentosModel medicamentosModel = new MedicamentosModel();
        ViewMedicamentos medicamentosView = new ViewMedicamentos();
        MedicamentosController medicamentosController = new MedicamentosController(medicamentosView,medicamentosModel);
        medicamentosController.loadMedicamentos();
/*
        JFrame window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        window.setTitle("Medicamentos");
        window.setContentPane(medicamentosView.getPanelMedicamentos());
        window.setVisible(true);
*/

        //DOCTORES
        hospital.presentacion.doctor. View doctorView = new View();
        hospital.presentacion.doctor.Model doctorModel = new Model();
        hospital.presentacion.doctor.Controller controllerDoctor = new Controller(doctorView, doctorModel);
        //FARMACEUTAS
        hospital.presentacion.farmaceuta.View farmaceutaView = new hospital.presentacion.farmaceuta.View();
        hospital.presentacion.farmaceuta.Model farmaceutaModel = new hospital.presentacion.farmaceuta.Model();
        hospital.presentacion.farmaceuta.Controller controllerFarmaceuta = new hospital.presentacion.farmaceuta.Controller(farmaceutaView, farmaceutaModel);

        //PACIENTES
        hospital.presentacion.paciente.View pacienteView = new hospital.presentacion.paciente.View();
        hospital.presentacion.paciente.Model pacientemodel = new hospital.presentacion.paciente.Model();
        hospital.presentacion.paciente.Controller controllerPaciente = new hospital.presentacion.paciente.Controller(pacienteView, pacientemodel);


        JFrame window = new JFrame();
        JTabbedPane tabbedPane = new JTabbedPane();
        window.setSize(700, 300);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setTitle("Proyecto_1");
        window.setContentPane(tabbedPane);
        tabbedPane.addTab("Pacientes", pacienteView.getPacientes_JPanel());
        tabbedPane.addTab("Farmaceutas",farmaceutaView.getFarmaceuta_Panel());
        tabbedPane.addTab("Doctores", doctorView.getMedicos_JPanel());
        tabbedPane.addTab("Medicamentos",medicamentosView.getPanelMedicamentos());
        controllerDoctor.loadDoctors();
        controllerPaciente.loadPacientes();
        controllerFarmaceuta.loadFarmaceutas();
        medicamentosController.loadMedicamentos();
        window.setContentPane(tabbedPane);

        //System.out.println();
        window.setVisible(true);

    }
}
