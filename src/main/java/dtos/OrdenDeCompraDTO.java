package dtos;

import java.io.Serializable;
import java.util.Date;

public class OrdenDeCompraDTO implements Serializable {

    private static final long serialVersionUID = 5078408432576206933L;

    private Integer id;
    private Date fechaEmision;
    private ArticuloDTO articulo;
    private Integer cantidad;
    private boolean resuelto;
    private ProveedorDTO proovedor;
    private float precio;

    public OrdenDeCompraDTO(ArticuloDTO articulo, ProveedorDTO proovedor) {
        this.articulo = articulo;
        this.proovedor = proovedor;
    }

    public OrdenDeCompraDTO(Integer id, Date fechaEmision, ArticuloDTO articulo, Integer cantidad, boolean resuelto, ProveedorDTO proovedor, float precio) {
        this.id = id;
        this.fechaEmision = fechaEmision;
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.resuelto = resuelto;
        this.proovedor = proovedor;
        this.precio = precio;
    }

    public OrdenDeCompraDTO(Date fechaEmision, ArticuloDTO articulo, Integer cantidad, boolean resuelto, ProveedorDTO proovedor, float precio) {
        this.fechaEmision = fechaEmision;
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.resuelto = resuelto;
        this.proovedor = proovedor;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ArticuloDTO getArticulo() {
        return articulo;
    }

    public void setArticulo(ArticuloDTO articulo) {
        this.articulo = articulo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isResuelto() {
        return resuelto;
    }

    public void setResuelto(boolean resuelto) {
        this.resuelto = resuelto;
    }

    public ProveedorDTO getProovedor() {
        return proovedor;
    }

    public void setProovedor(ProveedorDTO proovedor) {
        this.proovedor = proovedor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
}
