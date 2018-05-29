package dtos;

import java.io.Serializable;

public class ItemPedidoDTO  implements Serializable {

    private static final long serialVersionUID = -2418983531521633953L;
    private Integer id;
    private int cantidad;
    private ArticuloDTO articulo;



    public ItemPedidoDTO(int cantidad, ArticuloDTO articulo) {
        this.cantidad = cantidad;
        this.articulo = articulo;
    }

    public ItemPedidoDTO(Integer id, int cantidad, ArticuloDTO articulo) {
        this.id = id;
        this.cantidad = cantidad;
        this.articulo = articulo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ArticuloDTO getArticulo() {
        return articulo;
    }

    public void setArticulo(ArticuloDTO articulo) {
        this.articulo = articulo;
    }
}
