package dtos;

import java.io.Serializable;

public class OrdenDeCompraDTO implements Serializable {

    private static final long serialVersionUID = 5078408432576206933L;

    private Integer id;
    private ArticuloDTO articulo;
    private Integer cantidad;
    private boolean resuelto;
    private ProveedorDTO proovedor;

    public OrdenDeCompraDTO(ArticuloDTO articulo, ProveedorDTO proovedor) {
        this.articulo = articulo;
        this.proovedor = proovedor;
    }

    public OrdenDeCompraDTO(Integer id, ArticuloDTO articulo, Integer cantidad, boolean resuelto, ProveedorDTO proovedor) {
        this.id = id;
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.resuelto = resuelto;
        this.proovedor = proovedor;
    }

    public OrdenDeCompraDTO(ArticuloDTO articulo, Integer cantidad, boolean resuelto, ProveedorDTO proovedor) {
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.resuelto = resuelto;
        this.proovedor = proovedor;
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
}
