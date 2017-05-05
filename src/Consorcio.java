import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by Julian on 5/5/2017.
 */
public class Consorcio {


    private Edificio edifcio;
    private List<Propietario> propietarios;

    public Consorcio(Edificio edifcio, List<Propietario> propietarios) {
        this.edifcio = edifcio;
        this.propietarios = propietarios;
    }

    public void registrarGasto(BigDecimal monto, String motivo, Date fecha){
        Gasto gasto = new Gasto(monto, motivo, fecha);
        edifcio.registrarGasto(gasto);
    }



    public void emitirDocumentosExpensas(){
        BigDecimal monto = edifcio.dividirGastos();
        Expensa expensa = new Expensa(null,null,monto);
        propietarios.forEach(propietario -> propietario.agregarExpensa(expensa));
    }

    public Edificio getEdifcio() {
        return edifcio;
    }

    public void setEdifcio(Edificio edifcio) {
        this.edifcio = edifcio;
    }

    public List<Propietario> getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(List<Propietario> propietarios) {
        this.propietarios = propietarios;
    }

}
