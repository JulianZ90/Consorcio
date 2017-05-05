import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Julian on 5/5/2017.
 */
    public class Edificio {

        private List<Departamento> departamentos;
        private List<Gasto> gastos;


    public void registrarGasto(Gasto unGasto){
        gastos.add(unGasto);
    }

    public BigDecimal dividirGastos(){
        return   gastos.stream()
                .map(Gasto::getMonto)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public List<Gasto> getGastos() {
        return gastos;
    }

    public void setGastos(List<Gasto> gastos) {
        this.gastos = gastos;
    }
}
