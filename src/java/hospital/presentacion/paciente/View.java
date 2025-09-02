package hospital.presentacion.paciente;

import hospital.logic.Paciente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class View implements PropertyChangeListener {
    private JLabel PacientesLaber;
    private JLabel IDLabel;
    private JTextField textField_ID;
    private JTextField textField_Nombre;
    private JLabel NombreLabel;
    private JTextField textField_Telefono;
    private JButton guardarButton;
    private JButton limpiarButton;
    private JButton borrarButton;
    private JLabel BuscarLabel;
    private JTextField textField_Buscar;
    private JButton buscarButton;
    private JPanel PacienteJPanel;
    private JTable listaPacientes_JTable;

    public JPanel getPacientes_JPanel() {
        return PacienteJPanel;
    }

    public View(){

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                Paciente paciente = new Paciente();
                paciente.setId(textField_ID.getText());
                paciente.setNombre(textField_Nombre.getText());
                paciente.setNumeroTelefono(textField_Telefono.getText());

                try{
                    controller.createPaciente(paciente);
                    JOptionPane.showMessageDialog(null, "Paciente guardado exitosamente");
                    controller.loadPacientes();
                } catch(Exception ex){
                    JOptionPane.showMessageDialog(PacienteJPanel,"Error al crear paciente " + ex.getMessage());
                }
            }
        });

        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String id = textField_Buscar.getText();
                    if (!id.isEmpty()) {
                        controller.readPacientes(id);
                    } else {
                        controller.loadPacientes();
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(PacienteJPanel, "Error: " + ex.getMessage());
                }
            }
        });

        listaPacientes_JTable.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int row = listaPacientes_JTable.getSelectedRow();
                if (row != -1) {
                    Paciente selected = model.getListaPacientes().get(row);
                    model.setCurrent(selected);
                }
            }
        });

    //END OF VIEW//
    }

    //================== MVC ==================//
    Controller controller;
    Model model;

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        switch (evt.getPropertyName()) {
            case Model.CURRENT:
                textField_ID.setText(model.getCurrent().getId());
                textField_Nombre.setText(model.getCurrent().getNombre());
                textField_Telefono.setText(model.getCurrent().getNumeroTelefono());
                break;
            case Model.LISTAPACIENTES:
                int[] cols = {TableModel.CODIGO, TableModel.NOMBRE, TableModel.NUMEROTELEFONO};
                TableModel tableModel = new TableModel(cols, model.getListaPacientes());
                listaPacientes_JTable.setModel(tableModel);
                listaPacientes_JTable.updateUI();
                break;
        }
    }
}
