package hospital.data;

import hospital.logic.*;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    List<Doctor> doctores;
    List<Paciente> pacientes;
    List<Medicamento> medicamentos;
    List<Farmaceuta> farmaceutas;
    List<Receta> recetas;
    List<Prescripcion> prescripciones;
    //Constructores
    public Listas() {
        this.doctores = new ArrayList<Doctor>();
        doctores.add(new Doctor("AAA","DOC-111","ESPECIALIAD - A","123"));
        doctores.add(new Doctor("BBB","DOC-222","ESPECIALIAD - B","123"));
        doctores.add(new Doctor("CCC","DOC-333","ESPECIALIAD - C","123"));

        this.pacientes = new ArrayList<Paciente>();
        pacientes.add(new Paciente("PAC-111","AAA","111-222"));
        pacientes.add(new Paciente("PAC-222","BBB","222-333"));
        pacientes.add(new Paciente("PAC-333","CCC","333-444"));

        this.medicamentos = new ArrayList<Medicamento>();
        medicamentos.add(new Medicamento("MED-111","AAA",1.1));
        medicamentos.add(new Medicamento("MED-222","BBB",1.2));
        medicamentos.add(new Medicamento("MED-333","CCC",1.3));

        this.farmaceutas = new ArrayList<Farmaceuta>();
        farmaceutas.add(new Farmaceuta("FAR-111","AAA","111-222"));
        farmaceutas.add(new Farmaceuta("FAR-222","BBB","222-333"));
        farmaceutas.add(new Farmaceuta("FAR-333","CCC","333-444"));
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

    public List<Farmaceuta> getFarmaceutas() {
        return farmaceutas;
    }

    public void setFarmaceutas(List<Farmaceuta> farmaceutas) {
        this.farmaceutas = farmaceutas;
    }

    public List<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(List<Receta> recetas) {
        this.recetas = recetas;
    }

    public List<Prescripcion> getPrescripciones() {
        return prescripciones;
    }

    public void setPrescripciones(List<Prescripcion> prescripciones) {
        this.prescripciones = prescripciones;
    }
}
