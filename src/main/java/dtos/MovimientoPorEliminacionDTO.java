package dtos;

import java.io.Serializable;
import java.util.Date;

public class MovimientoPorEliminacionDTO implements Serializable {

    private static final long serialVersionUID = -8842384284989823437L;

    private Integer id;
    private Date fecha;
    private String tipo;
    private Integer cantidad;
    private String encargado;
    private String destino;
    private String autorizador;

    public MovimientoPorEliminacionDTO(Integer id, Date fecha, String tipo, Integer cantidad, String encargado, String destino, String autorizador) {
        this.id = id;
        this.fecha = fecha;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.encargado = encargado;
        this.destino = destino;
        this.autorizador = autorizador;
    }

    public MovimientoPorEliminacionDTO(Date fecha, String tipo, Integer cantidad, String encargado, String destino, String autorizador) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.encargado = encargado;
        this.destino = destino;
        this.autorizador = autorizador;
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

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getAutorizador() {
        return autorizador;
    }

    public void setAutorizador(String autorizador) {
        this.autorizador = autorizador;
    }
}
