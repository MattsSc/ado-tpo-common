package dtos;

import java.io.Serializable;
import java.util.Date;

public class MovimientoPorAjusteDTO implements Serializable {

    private static final long serialVersionUID = 2770688076873251581L;

    private Integer id;
    private Date fecha;
    private String tipo;
    private Integer cantidad;

    public MovimientoPorAjusteDTO(Integer id, Date fecha, String tipo, Integer cantidad) {
        this.id = id;
        this.fecha = fecha;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
