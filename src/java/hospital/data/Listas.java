package hospital.data;

import hospital.logic.Doctor;
import hospital.logic.Medicamento;
import hospital.logic.Paciente;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    List<Doctor> doctores;
    List<Paciente> pacientes;
    List<Medicamento> medicamentos;
    //Constructores
    public Listas() {
        this.doctores = new ArrayList<Doctor>();
        doctores.add(new Doctor("DOC-111","AAA","ESPECIALIAD - A","123"));
        doctores.add(new Doctor("DOC-222","BBB","ESPECIALIAD - B","123"));
        doctores.add(new Doctor("DOC-333","CCC","ESPECIALIAD - C","123"));
        this.pacientes = new ArrayList<Paciente>();
        pacientes.add(new Paciente("PAC-111","AAA","111-222"));
        pacientes.add(new Paciente("PAC-222","BBB","222-333"));
        pacientes.add(new Paciente("PAC-333","CCC","333-444"));
        this.medicamentos = new ArrayList<Medicamento>();
        medicamentos.add(new Medicamento("111","AAA",1.1));
        medicamentos.add(new Medicamento("222","BBB",1.2));
        medicamentos.add(new Medicamento("333","CCC",1.3));
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
}
