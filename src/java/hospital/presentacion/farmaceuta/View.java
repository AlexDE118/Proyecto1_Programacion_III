package hospital.presentacion.farmaceuta;

import hospital.logic.Farmaceuta;
import hospital.presentacion.farmaceuta.TableModel;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class View  implements PropertyChangeListener {
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
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                Farmaceuta f = new Farmaceuta();
                f.setNombre(nombre_textField.getText());
                f.setId(ID_textField.getText());
                f.setClave(ID_textField.getText());
                try{
                    controller.createFarmaceuta(f);
                    JOptionPane.showMessageDialog(null, "Farmaceuta creada con exito");
                    controller.loadFarmaceutas();
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Error al crear el Farmaceuta " + ex.getMessage());
                }
            }
        });

        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                ID_textField.setText("");
                nombre_textField.setText("");
            }
        });

        //END OF VIEW//
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
                int[] cols = {TableModel.ID,TableModel.NAME};
                TableModel tableModel = new TableModel(cols,model.getFarmaceutas());
                farmaceuta_Table.setModel(tableModel);
                farmaceuta_Table.updateUI();
                break;
        }
    }
}
