package dtos;

import java.io.Serializable;

public class ArticuloDTO implements Serializable {
    private static final long serialVersionUID = 6441169009474107346L;
    private Integer codigo;
    private String descripcion;
    private String presentacion;
    private int tamanio;
    private int unidad;
    private float precio;
    private Integer cantReposicion;

    @Override
    public String toString() {
        return this.getCodigo() +" - "+ this.getDescripcion();
    }

    public ArticuloDTO(Integer codigo, String descripcion, String presentacion, int tamanio, int unidad, float precio, Integer cantReposicion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.presentacion = presentacion;
        this.tamanio = tamanio;
        this.unidad = unidad;
        this.precio = precio;
        this.cantReposicion = cantReposicion;
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

    public Integer getCantReposicion() {
        return cantReposicion;
    }

    public void setCantReposicion(Integer cantReposicion) {
        this.cantReposicion = cantReposicion;
    }
}
