package hospital.presentacion.farmaceuta;

import hospital.logic.Farmaceuta;

import javax.swing.*;
import java.beans.PropertyChangeEvent;

public class View {
    private JLabel farmaceutaLabel;
    private JLabel IDLabel;
    private JTextField ID_textField;
    private JTextField nombre_textField;
    private JLabel nombreLabel;
    private JButton guardarButton;
    private JButton limpiarButton;
    private JButton borrarButton;
    private JLabel buscarLabel;
    private JTextField buscar_textField;
    private JButton buscarButton;
    private JButton reporteButton;
    private JTable farmaceuta_Table;

    public JTable getFarmaceuta_Table() {
        return farmaceuta_Table;
    }

    public View(){

    }

    //================== MVC ==================//

    Controller controller;
    Model model;

    public void setController(Controller controller){
        this.controller = controller;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void propertyChange(PropertyChangeEvent evt) {
        switch (evt.getPropertyName()) {
            case Model.CURRENT:
                //---//
                break;
            case Model.LISTAFARMACEUTAS:
                //---//
                break;
        }
    }
}
