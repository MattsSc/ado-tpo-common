package dtos;

import java.io.Serializable;

public class UbicacionDTO implements Serializable {

    private static final long serialVersionUID = 5763665607548697213L;

    private Integer idUbicacion;
    private String clave;
    private Boolean ocupado;
    private LoteDTO lote;
    private Integer cantidad;

    public UbicacionDTO(Integer idUbicacion, String clave, Boolean ocupado, LoteDTO lote, Integer cantidad) {
        this.idUbicacion = idUbicacion;
        this.clave = clave;
        this.ocupado = ocupado;
        this.lote = lote;
        this.cantidad = cantidad;
    }

    public Integer getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(Integer idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Boolean getOcupado() {
        return ocupado;
    }

    public void setOcupado(Boolean ocupado) {
        this.ocupado = ocupado;
    }

    public LoteDTO getLote() {
        return lote;
    }

    public void setLote(LoteDTO lote) {
        this.lote = lote;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
