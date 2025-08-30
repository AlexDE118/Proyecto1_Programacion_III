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
        View view = new View();
        Model model = new Model();
        Controller controllerDoctor = new Controller(view, model);
        controllerDoctor.loadDoctors();
        JFrame window = new JFrame();
        window.setSize(700, 300);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setTitle("Proyecto_1");
        window.setContentPane(view.getMedicos_JPanelPanel());
        window.setVisible(true);
    }
}
