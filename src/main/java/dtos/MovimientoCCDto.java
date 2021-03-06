package dtos;

import java.io.Serializable;
import java.util.Date;

public class MovimientoCCDto implements Serializable{

    private static final long serialVersionUID = 2677561337143819018L;
    private int idMovimiento;
    private Date fecha;
    private float importe;
    private String tipo;

    public MovimientoCCDto(int idMovimiento, Date fecha, float importe, String tipo) {
        this.idMovimiento = idMovimiento;
        this.fecha = fecha;
        this.importe = importe;
        this.tipo = tipo;
    }

    public int getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
