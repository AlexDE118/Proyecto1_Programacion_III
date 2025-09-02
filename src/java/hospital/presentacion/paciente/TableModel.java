package hospital.presentacion.paciente;

import hospital.logic.Paciente;
import hospital.presentacion.AbstractTableModel;

import java.util.List;

public class TableModel extends AbstractTableModel<Paciente> implements javax.swing.table.TableModel {
    public TableModel(int cols[], List<Paciente> rows) {
        super(cols,rows);
    }
    public static final int CODIGO = 1;
    public static final int NOMBRE = 2;
    public static final int NUMEROTELEFONO = 3;

    @Override
    protected void initColNames(){
        columnName = new String[4];
        columnName[CODIGO] = "Codigo";
        columnName[NOMBRE] = "Nombre";
        columnName[NUMEROTELEFONO] = "Telefono";
    }

    @Override
    protected Object getPropertyAt(Paciente paciente,int columna){
        switch (column[columna]) {
            case CODIGO:
                return paciente.getId();
            case NOMBRE:
                return paciente.getNombre();
            case NUMEROTELEFONO:
                return paciente.getNumeroTelefono();
            default:
                return null;
        }
    }
}
