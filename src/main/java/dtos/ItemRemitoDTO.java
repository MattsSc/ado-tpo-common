package dtos;

import java.io.Serializable;

public class ItemRemitoDTO implements Serializable {

    private static final long serialVersionUID = -5669326501083606697L;

    private int Item;
    private ArticuloDTO articulo;
    private int cantidad;

    public ItemRemitoDTO(int item, ArticuloDTO articulo, int cantidad) {
        Item = item;
        this.articulo = articulo;
        this.cantidad = cantidad;
    }

    public ItemRemitoDTO(int item, int cantidad) {
        Item = item;
        this.articulo = new ArticuloDTO();
        this.cantidad = cantidad;
    }

    public int getItem() {
        return Item;
    }

    public void setItem(int item) {
        Item = item;
    }

    public ArticuloDTO getArticulo() {
        return articulo;
    }

    public void setArticulo(ArticuloDTO articulo) {
        this.articulo = articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ItemRemitoDTO() {
    }
}
