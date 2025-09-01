package hospital;

import hospital.presentacion.doctor.Controller;
import hospital.presentacion.doctor.Model;
import hospital.presentacion.doctor.View;
import hospital.presentacion.paciente.*;

import javax.swing.*;

public class Application {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ex) { ex.printStackTrace();}
        hospital.presentacion.doctor. View doctorView = new View();
        hospital.presentacion.doctor.Model doctorModel = new Model();
        hospital.presentacion.doctor.Controller controllerDoctor = new Controller(doctorView, doctorModel);
        controllerDoctor.loadDoctors();

        hospital.presentacion.farmaceuta.View farmaceutaView = new hospital.presentacion.farmaceuta.View();
        hospital.presentacion.farmaceuta.Model farmaceutaModel = new hospital.presentacion.farmaceuta.Model();
        hospital.presentacion.farmaceuta.Controller controllerFarmaceuta = new hospital.presentacion.farmaceuta.Controller(farmaceutaView, farmaceutaModel);

        JFrame window = new JFrame();
        JTabbedPane tabbedPane = new JTabbedPane();


        window.setSize(700, 300);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setTitle("Proyecto_1");
        //window.setContentPane(doctorView.getMedicos_JPanelPanel());
        window.setContentPane(tabbedPane);
        tabbedPane.addTab("Doctores", doctorView.getMedicos_JPanelPanel());
        tabbedPane.addTab("Farmaceutas",farmaceutaView.getFarmaceuta_Table());

        window.setVisible(true);
    }
}
