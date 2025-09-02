package hospital;

import hospital.presentacion.doctor.Controller;
import hospital.presentacion.doctor.Model;
import hospital.presentacion.doctor.View;


import javax.swing.*;

public class Application {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ex) { ex.printStackTrace();}

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

        controllerDoctor.loadDoctors();
        controllerPaciente.loadPacientes();
        controllerFarmaceuta.loadFarmaceutas();

        window.setContentPane(tabbedPane);

        System.out.println();
        window.setVisible(true);
    }
}
