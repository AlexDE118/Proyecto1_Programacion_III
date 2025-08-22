package hospital.presentacion.doctor;

import javax.swing.*;

public class View {
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

    public View() { }
    public JPanel getMedicos_JPanelPanel() {
        return Medicos_JPanel;
    }
}
