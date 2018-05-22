package dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RemitoDTO implements Serializable {

    private static final long serialVersionUID = 8899663097645726599L;

    private Integer idRemito;
    private Date fecha;
    private ClienteDTO cliente;
    private List<ItemRemitoDTO> itemsRemito;

    public RemitoDTO(Integer idRemito, Date fecha, ClienteDTO cliente, List<ItemRemitoDTO> itemsRemito) {
        this.idRemito = idRemito;
        this.fecha = fecha;
        this.cliente = cliente;
        this.itemsRemito = itemsRemito;
    }

    public RemitoDTO(Integer idRemito, Date fecha) {
        this.idRemito = idRemito;
        this.fecha = fecha;
        this.cliente = new ClienteDTO();
        this.itemsRemito = new ArrayList<ItemRemitoDTO>();
    }

    public Integer getIdRemito() {
        return idRemito;
    }

    public void setIdRemito(Integer idRemito) {
        this.idRemito = idRemito;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ClienteDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }

    public List<ItemRemitoDTO> getItemsRemito() {
        return itemsRemito;
    }

    public void setItemsRemito(List<ItemRemitoDTO> itemsRemito) {
        this.itemsRemito = itemsRemito;
    }

    public RemitoDTO() {
    }
}
