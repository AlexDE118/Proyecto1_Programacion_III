package hospital.presentacion.prescripciones;

import javax.swing.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PrescripcionView {
    private JPanel PrescripcionPanel;
    private JButton buscarPacienteButton;
    private JButton agregarMedicamentoButton;
    private JLabel PacienteLabel;
    private JTable PrescripcionTableMedicamentos;
    private JButton guardarButton;
    private JButton limpiarButton;
    private JButton descartarMedicamentoButton;

    public JPanel getPrescripcionPanel() {
        return PrescripcionPanel;
    }

    public PrescripcionView(){

    }

    //======== MVC ========//
    PrescripcionController controller;
    PrescripcionModel model;

    public void setController(PrescripcionController controller){
        this.controller = controller;
    }

    public void setModel(PrescripcionModel model){
        this.model = model;
    }

//    @Override
//    public void propertyChange(PropertyChangeEvent evt) {
//
//    }
}
