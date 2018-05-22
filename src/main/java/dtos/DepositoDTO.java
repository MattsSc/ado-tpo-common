package dtos;

import java.io.Serializable;
import java.util.ArrayList;

public class DepositoDTO implements Serializable {

    private static final long serialVersionUID = -7561497011354282544L;

    private ArrayList<UbicacionDTO> ubicaciones;

    public DepositoDTO(ArrayList<UbicacionDTO> ubicaciones) {
        this.ubicaciones = ubicaciones;
    }

    public ArrayList<UbicacionDTO> getUbicaciones() {
        return ubicaciones;
    }

    public void setUbicaciones(ArrayList<UbicacionDTO> ubicaciones) {
        this.ubicaciones = ubicaciones;
    }

    public DepositoDTO() {
    }
}
