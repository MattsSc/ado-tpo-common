package dtos;

import java.io.Serializable;

public class ProveedorPrecioDTO implements Serializable {

    private static final long serialVersionUID = -3892748741533845478L;

    private ProveedorDTO proveedorDTO;
    private float total;

    public ProveedorPrecioDTO(ProveedorDTO proveedorDTO, float total) {
        this.proveedorDTO = proveedorDTO;
        this.total = total;
    }

    public ProveedorDTO getProveedorDTO() {
        return proveedorDTO;
    }

    public void setProveedorDTO(ProveedorDTO proveedorDTO) {
        this.proveedorDTO = proveedorDTO;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
