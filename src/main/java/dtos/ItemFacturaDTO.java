package dtos;

import java.io.Serializable;

public class ItemFacturaDTO implements Serializable {


    private static final long serialVersionUID = 4092634586314018614L;

    private int IdItem;
    private ArticuloDTO articulo;
    private int cantidad;

    public ItemFacturaDTO(int idItem, ArticuloDTO articulo, int cantidad) {
        IdItem = idItem;
        this.articulo = articulo;
        this.cantidad = cantidad;
    }

    public int getIdItem() {
        return IdItem;
    }

    public void setIdItem(int idItem) {
        IdItem = idItem;
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

    public ItemFacturaDTO() {
    }
}
