package dtos;

import java.io.Serializable;
import java.util.Date;

public class LoteDTO implements Serializable {

    private static final long serialVersionUID = -5610364864650046157L;

    private Integer id;
    private Date fechaVencimiento;
    private int stock;
    private ProveedorDTO proveedor;

    public LoteDTO(Integer id, Date fechaVencimiento, int stock, ProveedorDTO proveedor) {
        this.id = id;
        this.fechaVencimiento = fechaVencimiento;
        this.stock = stock;
        this.proveedor = proveedor;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ProveedorDTO getProveedor() {
        return proveedor;
    }

    public void setProveedor(ProveedorDTO proveedor) {
        this.proveedor = proveedor;
    }
}
