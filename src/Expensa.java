import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Julian on 5/5/2017.
 */
public class Expensa {

    private Date fechaVencimiento;
    private Date fechaEmision;
    private BigDecimal monto;

    public Expensa(Date fechaVencimiento, Date fechaEmision, BigDecimal monto) {
        this.fechaVencimiento = fechaVencimiento;
        this.fechaEmision = fechaEmision;
        this.monto = monto;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }
}
