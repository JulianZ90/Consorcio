import java.util.List;

/**
 * Created by Julian on 5/5/2017.
 */
public class Propietario {

    private List<Departamento> departamentos;
    private List<Expensa> expensas;



    public void agregarExpensa(Expensa expensa){
        expensas.add(expensa);
    }


    public List<Expensa> getExpensas() {
        return expensas;
    }

    public void setExpensas(List<Expensa> expensas) {
        this.expensas = expensas;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

}
