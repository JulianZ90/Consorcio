import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Julian on 5/5/2017.
 */
public class Gasto {

    private BigDecimal monto;
    private String motivo;
    private Date fecha;

    public Gasto(BigDecimal monto, String motivo, Date fecha) {
        this.monto = monto;
        this.motivo = motivo;
        this.fecha = fecha;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
