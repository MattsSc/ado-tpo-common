package dtos;

import java.io.Serializable;

public class OrdenDePedidoDTO implements Serializable {

    private static final long serialVersionUID = 483902991883727399L;

    private Integer id;
    private ArticuloDTO articulo;
    private Integer cantidad;
    private Integer idPedido;
    private Integer idOrdenCompra;

    public OrdenDePedidoDTO(Integer id, ArticuloDTO articulo, Integer cantidad, Integer idPedido, Integer idOrdenCompra) {
        this.id = id;
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.idPedido = idPedido;
        this.idOrdenCompra = idOrdenCompra;
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

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Integer getIdOrdenCompra() {
        return idOrdenCompra;
    }

    public void setIdOrdenCompra(Integer idOrdenCompra) {
        this.idOrdenCompra = idOrdenCompra;
    }
}
