package dtos;

import java.util.Date;

public class MovimientoDTO {
    private Integer id;
    private Date fecha;
    private int cantidad;
    private String tipo;
    private String descripcion;
    private String estado;
    private String encargado;
    private String destino;
    private String auotorizador;

    public MovimientoDTO(Integer id, Date fecha, int cantidad, String tipo) {
        this.id = id;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public MovimientoDTO(Integer id, Date fecha, int cantidad, String tipo, String descripcion, String estado) {
        this.id = id;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public MovimientoDTO(Integer id, Date fecha, int cantidad, String tipo, String estado) {
        this.id = id;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.estado = estado;
    }

    public MovimientoDTO(Integer id, Date fecha, int cantidad, String tipo, String encargado, String destino, String auotorizador) {
        this.id = id;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.encargado = encargado;
        this.destino = destino;
        this.auotorizador = auotorizador;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public String getAuotorizador() {
        return auotorizador;
    }

    public void setAuotorizador(String auotorizador) {
        this.auotorizador = auotorizador;
    }
}
