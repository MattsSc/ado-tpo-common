package dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ArticuloDTO implements Serializable {

    private static final long serialVersionUID = 304767771881426451L;

    private Integer codigo;
    private String descripcion;
    private String presentacion;
    private int tamanio;
    private int unidad;
    private float precio;
    private List<LoteDTO> lotes;
    private List<MovimientoDTO> movimientos;


    public ArticuloDTO(Integer codigo, String descripcion, String presentacion, int tamanio, int unidad, float precio, List<LoteDTO> lotes, List<MovimientoDTO> movimientos) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.presentacion = presentacion;
        this.tamanio = tamanio;
        this.unidad = unidad;
        this.precio = precio;
        this.lotes = lotes;
        this.movimientos = movimientos;
    }

    public ArticuloDTO() {
    }

    public ArticuloDTO(Integer codigo, String descripcion, String presentacion, int tamanio, int unidad, float precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.presentacion = presentacion;
        this.tamanio = tamanio;
        this.unidad = unidad;
        this.precio = precio;
        this.lotes = new ArrayList<LoteDTO>();
        this.movimientos = new ArrayList<MovimientoDTO>();
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public List<LoteDTO> getLotes() {
        return lotes;
    }

    public void setLotes(List<LoteDTO> lotes) {
        this.lotes = lotes;
    }

    public List<MovimientoDTO> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<MovimientoDTO> movimientos) {
        this.movimientos = movimientos;
    }
}
