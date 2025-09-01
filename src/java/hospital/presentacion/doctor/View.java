package hospital.presentacion.doctor;

import hospital.logic.Doctor;
import hospital.presentacion.doctor.TableModel;

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
                doctor.setEspecialidad(especialidad_textField.getText());
                doctor.setClave(ID_textfield.getText());
                try{
                    controller.createDoctor(doctor);
                    JOptionPane.showMessageDialog(null, "Doctor guardado exitosamente");
                    controller.loadDoctors();
                } catch(Exception ex){
                    JOptionPane.showMessageDialog(Medicos_JPanel, "Error al crear el Doctor " + ex.getMessage());
                }
            }

        });

        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Doctor doctor = new Doctor();
            }
        });

        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ID_textfield.setText("");
                nombre_textfield.setText("");
                especialidad_textField.setText("");
            }
        });

        listaDoctores_JTable.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int row = listaDoctores_JTable.getSelectedRow();
                if (row != -1) {
                    Doctor selected = model.getListaDoctores().get(row);
                    model.setCurrent(selected);
                }
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


    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        switch (evt.getPropertyName()) {
            case Model.CURRENT:
                ID_textfield.setText(model.getCurrent().getId());
                nombre_textfield.setText(model.getCurrent().getNombre());
                especialidad_textField.setText(model.getCurrent().getEspecialidad());
                //buscar_textfield.setText(model.getCurrent().getClave());
                break;
            case Model.LISTADOCTORES:
                int[] cols = {TableModel.ID,TableModel.NAME, TableModel.ESPECIALIAD};
                TableModel tableModel = new TableModel(cols, model.getListaDoctores());
                listaDoctores_JTable.setModel(tableModel);
                listaDoctores_JTable.updateUI();
                break;
        }
    }
}
