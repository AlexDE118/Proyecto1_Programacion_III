package data;

import logic.Doctor;
import logic.Medicamento;
import logic.Paciente;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    List<Doctor> doctores;
    List<Paciente> pacientes;
    List<Medicamento> medicamentos;
    //Constructores
    public Listas() {
        this.doctores = new ArrayList<Doctor>();
        this.pacientes = new ArrayList<Paciente>();
        this.medicamentos = new ArrayList<Medicamento>();
    }

    //Setters | Getters
    public List<Doctor> getDoctores() {
        return doctores;
    }

    public void setDoctores(List<Doctor> doctores) {
        this.doctores = doctores;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }
    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    // Metodos de la clase


}
