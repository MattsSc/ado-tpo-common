package dtos;

import java.io.Serializable;

public class OrdenPedidoDTO implements Serializable {

    private static final long serialVersionUID = 6521673645042324397L;

    private Integer id;
    private ArticuloDTO articulo;
    private Integer cantidad;
    private PedidoDTO pedido;
    private String estado;

    public OrdenPedidoDTO(Integer id, ArticuloDTO articulo, Integer cantidad, PedidoDTO pedido, String estado) {
        this.id = id;
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.pedido = pedido;
        this.estado = estado;
    }

    public OrdenPedidoDTO(Integer id, Integer cantidad, String estado) {
        this.id = id;
        this.articulo = new ArticuloDTO();
        this.cantidad = cantidad;
        this.pedido = new PedidoDTO();
        this.estado = estado;
    }

    public OrdenPedidoDTO() {
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

    public PedidoDTO getPedido() {
        return pedido;
    }

    public void setPedido(PedidoDTO pedido) {
        this.pedido = pedido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
