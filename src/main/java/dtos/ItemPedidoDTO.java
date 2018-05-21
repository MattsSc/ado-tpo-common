package dtos;

import java.io.Serializable;

public class ItemPedidoDTO implements Serializable {

    private static final long serialVersionUID = -6883666134067204727L;

    private Integer id;
    private int cantidad;
    private LoteDTO lote;

    public ItemPedidoDTO(Integer id, int cantidad, LoteDTO lote) {
        this.id = id;
        this.cantidad = cantidad;
        this.lote = lote;
    }

    public ItemPedidoDTO(Integer id, int cantidad) {
        this.id = id;
        this.cantidad = cantidad;
        this.lote = new LoteDTO();
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

    public LoteDTO getLote() {
        return lote;
    }

    public void setLote(LoteDTO lote) {
        this.lote = lote;
    }
}
