package hospital.logic;
import hospital.data.Listas;

import java.util.List;

//singleton

public class Service {
    private static Service instance;
    private Listas listas;

    public static Service instance(){
        if(instance == null) instance = new Service();
        return instance;
    }

    private Service(){ listas = new Listas(); }

    //================== DOCTORES ==================//

    public void createDoctor(Doctor doctor) throws Exception{
        Doctor result = listas.getDoctores().stream()
                .filter(x -> x.getId().equals(doctor.getId())).findFirst().orElse(null);
        // Linea anterior revisa si la ID del doctor existe, de ser asi result apunta al objeto encontrado, o a NULL//

        if(result == null){
            listas.getDoctores().add(doctor);
        }else{
            throw new Exception("Doctor existente");
        }
    }

    public Doctor readDoctor(Doctor doctor) throws Exception {
        Doctor result = listas.getDoctores().stream().filter(x -> x.getId().equals(doctor.getId())).findFirst().orElse(null);

        if(result != null){
            return result;
        }else {
            throw new Exception("Doctor no existente");
        }

    }

    public List<Doctor> loadListaDoctores(){
        return listas.getDoctores();
    }

    public void deleteDoctor(Doctor doctor) throws Exception {
        Doctor result = listas.getDoctores().stream().filter(x -> x.getId().equals(doctor.getId())).findFirst().orElse(null);
        if(result != null){
            listas.getDoctores().remove(result);
        }
        else {
            throw new Exception("Doctor no existente");
        }
    }

    //================== Pacientes ==================//

    public void createPaciente(Paciente paciente) throws Exception{
        Paciente result = listas.getPacientes().stream()
                .filter(x -> x.getId().equals(paciente.getId())).findFirst().orElse(null);
        if(result == null){
            listas.getPacientes().add(paciente);
        }else {
            throw new Exception("Paciente existente");
        }
    }

    public Paciente readPaciente(Paciente paciente) throws Exception {
        Paciente result = listas.getPacientes().stream()
                .filter(x -> x.getId().equals(paciente.getId())).findFirst().orElse(null);
        if(result != null){
            return result;
        }else  {
            throw new Exception("Paciente no existente");
        }
    }

    public List<Paciente> loadListaPacientes(){
        return listas.getPacientes();
    }

    //================== Farmaceutas ==================//

    public void createFarmaceuta(Farmaceuta farmaceuta) throws Exception{
        Farmaceuta result = listas.getFarmaceutas().stream()
                .filter(x -> x.getId().equals(farmaceuta.getId())).findFirst().orElse(null);

        if(result == null){
            listas.getFarmaceutas().add(farmaceuta);
        }else {
            throw new Exception("Farmaceuta existente");
        }
    }

    public Farmaceuta readFarmaceuta(Farmaceuta farmaceuta) throws Exception{
        Farmaceuta result = listas.getFarmaceutas().stream()
                .filter(x -> x.getId().equals(farmaceuta.getId())).findFirst().orElse(null);

        if(result != null){
            return result;
        }else {
            throw new Exception("Farmaceuta existente");
        }
    }

    public List<Farmaceuta> loadListaFarmaceutas(){
        return listas.getFarmaceutas();
    }

    //================== Medicamentos ==================//

    public void createMedicamentos(Medicamento medicamento) throws Exception{
        Medicamento result = listas.getMedicamentos().stream()
                .filter(x -> x.getID().equals(medicamento.getID())).findFirst().orElse(null);
        if(result == null){
            listas.getMedicamentos().add(medicamento);
        } else  {
            throw new Exception("Medicamento existente");
        }
    }

    public Medicamento readMedicamentos(Medicamento medicamento) throws Exception{
        Medicamento result = listas.getMedicamentos().stream()
                .filter(x -> x.getID().equals(medicamento.getID())).findFirst().orElse(null);
        if(result != null){
            return result;
        } else   {
            throw new Exception("Medicamento existente");
        }
    }

    public List<Medicamento> loadListaMedicamentos(){
        return listas.getMedicamentos();
    }
    //========================== Receta ==========================//

    public List<Receta>  loadListaRecetas(){
        return listas.getRecetas();
    }

    //========================== Prescripcion ==========================//

    public List<Prescripcion> loadListaPrescripciones(){
        return listas.getPrescripciones();
    }

    //======================= END ======================//
}

