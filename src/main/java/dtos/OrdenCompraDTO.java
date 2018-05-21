package dtos;

import java.io.Serializable;

public class OrdenCompraDTO implements Serializable {

    private static final long serialVersionUID = -779351294820975690L;

    private Integer id;
    private ArticuloDTO articulo;
    private Integer cantidad;
    private OrdenPedidoDTO ordenPedido;
    private String estado;
    private ProveedorDTO proovedor;
    private Float cortoOrdenDeCompra;

    public OrdenCompraDTO(Integer id, ArticuloDTO articulo, Integer cantidad, OrdenPedidoDTO ordenPedido, String estado, ProveedorDTO proovedor, Float cortoOrdenDeCompra) {
        this.id = id;
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.ordenPedido = ordenPedido;
        this.estado = estado;
        this.proovedor = proovedor;
        this.cortoOrdenDeCompra = cortoOrdenDeCompra;
    }

    public OrdenCompraDTO(Integer id, Integer cantidad, String estado, Float cortoOrdenDeCompra) {
        this.id = id;
        this.articulo = new ArticuloDTO();
        this.cantidad = cantidad;
        this.ordenPedido = new OrdenPedidoDTO();
        this.estado = estado;
        this.proovedor = new ProveedorDTO();
        this.cortoOrdenDeCompra = cortoOrdenDeCompra;
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

    public OrdenPedidoDTO getOrdenPedido() {
        return ordenPedido;
    }

    public void setOrdenPedido(OrdenPedidoDTO ordenPedido) {
        this.ordenPedido = ordenPedido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ProveedorDTO getProovedor() {
        return proovedor;
    }

    public void setProovedor(ProveedorDTO proovedor) {
        this.proovedor = proovedor;
    }

    public Float getCortoOrdenDeCompra() {
        return cortoOrdenDeCompra;
    }

    public void setCortoOrdenDeCompra(Float cortoOrdenDeCompra) {
        this.cortoOrdenDeCompra = cortoOrdenDeCompra;
    }
}
