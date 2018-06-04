package dtos;

import java.io.Serializable;
import java.util.List;

public class ItemAProcesarDTO implements Serializable {

    private static final long serialVersionUID = -2832914578554075516L;

    private String articuloDescripcion;
    private List<String> ubicaciones;
    private Integer cantidad;

    public ItemAProcesarDTO(String articuloDescripcion, List<String> ubicaciones, Integer cantidad) {
        this.articuloDescripcion = articuloDescripcion;
        this.ubicaciones = ubicaciones;
        this.cantidad = cantidad;
    }

    public String getArticuloDescripcion() {
        return articuloDescripcion;
    }

    public void setArticuloDescripcion(String articuloDescripcion) {
        this.articuloDescripcion = articuloDescripcion;
    }

    public List<String> getUbicaciones() {
        return ubicaciones;
    }

    public void setUbicacion(List<String> ubicaciones) {
        this.ubicaciones = ubicaciones;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
