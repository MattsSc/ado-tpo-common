package dtos;

import java.io.Serializable;
import java.util.Date;

public class MovimientoDTO implements Serializable {

    private static final long serialVersionUID = 5876885262370779792L;

    private String id;
    private Date fecha;
    private int cantidad;
    private TipoMovimientoDTO tipo;

    public MovimientoDTO(String id, Date fecha, int cantidad, TipoMovimientoDTO tipo) {
        this.id = id;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public MovimientoDTO(String id, Date fecha, int cantidad) {
        this.id = id;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.tipo = new TipoMovimientoDTO();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public TipoMovimientoDTO getTipo() {
        return tipo;
    }

    public void setTipo(TipoMovimientoDTO tipo) {
        this.tipo = tipo;
    }
}
