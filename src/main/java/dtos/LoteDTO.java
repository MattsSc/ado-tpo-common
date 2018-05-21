package dtos;

import java.io.Serializable;
import java.util.Date;

public class LoteDTO implements Serializable {

    private static final long serialVersionUID = -7328342231361969621L;

    private Integer id;
    private Date fechaVencimiento;
    private int cantidad;
    private ProveedorDTO proovedor;

    public LoteDTO(Integer id, Date fechaVencimiento, int cantidad, ProveedorDTO proovedor) {
        this.id = id;
        this.fechaVencimiento = fechaVencimiento;
        this.cantidad = cantidad;
        this.proovedor = proovedor;
    }

    public LoteDTO(Integer id, Date fechaVencimiento, int cantidad) {
        this.id = id;
        this.fechaVencimiento = fechaVencimiento;
        this.cantidad = cantidad;
        this.proovedor = new ProveedorDTO();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ProveedorDTO getProovedor() {
        return proovedor;
    }

    public void setProovedor(ProveedorDTO proovedor) {
        this.proovedor = proovedor;
    }
}
