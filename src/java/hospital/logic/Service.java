package hospital.logic;
import hospital.data.Listas;

//singleton

public class Service {
    private static Service instance;
    private Listas listas;

    public static Service instance(){
        if(instance == null) instance = new Service();
        return instance;
    }

    //================== DOCTORES ==================//

    public void createDoctor(Doctor doctor) throws Exception{
        Doctor result = listas.getDoctores().stream().filter(x -> x.getId().equals(doctor.getId())).findFirst().orElse(null);
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
            throw new Exception("Doctor existente");
        }

    }

    //================== Pacientes ==================//



    //================== Farmaceutas ==================//



    //================== Medicamentos ==================//


    //======================= END ======================//
}

