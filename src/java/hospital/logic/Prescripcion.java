package hospital.logic;

import hospital.logic.Receta;

public class Prescripcion {
    Paciente paciente;
    Receta receta;

    public Prescripcion(){
        paciente = new Paciente();
        receta = new Receta();
    }

    public Prescripcion(Paciente paciente, Receta receta) {
        this.paciente = paciente;
        this.receta = receta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }


}
