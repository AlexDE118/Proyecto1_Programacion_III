package hospital.presentacion.doctor;

import hospital.logic.Doctor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class View implements PropertyChangeListener {
    private JLabel ID_label;
    private JTextField ID_textfield;
    private JLabel title_label;
    private JTextField especialidad_textField;
    private JLabel especialidad_label;
    private JTextField nombre_textfield;
    private JLabel nombre_label;
    private JPanel Medicos_JPanel;
    private JButton guardarButton;
    private JButton limpiarButton;
    private JButton borrarButton;
    private JLabel buscar_label;
    private JTextField buscar_textfield;
    private JButton buscarButton;
    private JButton reporteButton;
    private JTable listaDoctores_JTable;

    public JPanel getMedicos_JPanelPanel() {
        return Medicos_JPanel;
    }

    public View() {
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Doctor doctor = new Doctor();
                doctor.setId(ID_textfield.getText());
                doctor.setNombre(nombre_textfield.getText());
                doctor.setEspecialidad("TEMP");//TEMP
                doctor.setClave("123");//TEMP
//                try {
//                    controller.createDoctor(doctor);
//                    JOptionPane.showMessageDialog(null, "Doctor guardado con éxito");
//                } catch (Exception ex) {
//                    JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
//                }
            }

        });

        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Doctor doctor = new Doctor();
            }
        });
    }

    //================== MVC ==================//
    Controller controller;
    Model model;

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void setModel(Model model) {
        this.model = model;
        model.addPropertyChangeListener(this);
    }


    //@Override
    public void propertyChange(PropertyChangeEvent evt) {
//        switch (evt.getPropertyName()) {
//            case Model.CURRENT
//
//        }
    }
}
