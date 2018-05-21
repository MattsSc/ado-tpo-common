package dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FacturaDTO implements Serializable {

    private static final long serialVersionUID = 3281702309488738193L;

    private Integer nroFactura;
    private Date Fecha;
    private ClienteDTO cliente;
    private List<ItemFacturaDTO> itemsFactura;

    public FacturaDTO(Integer nroFactura, Date fecha, ClienteDTO cliente, List<ItemFacturaDTO> itemsFactura) {
        this.nroFactura = nroFactura;
        Fecha = fecha;
        this.cliente = cliente;
        this.itemsFactura = itemsFactura;
    }

    public FacturaDTO(Integer nroFactura, Date fecha) {
        this.nroFactura = nroFactura;
        Fecha = fecha;
        this.cliente = new ClienteDTO();
        this.itemsFactura = new ArrayList<ItemFacturaDTO>();
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(Integer nroFactura) {
        this.nroFactura = nroFactura;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public ClienteDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }

    public List<ItemFacturaDTO> getItemsFactura() {
        return itemsFactura;
    }

    public void setItemsFactura(List<ItemFacturaDTO> itemsFactura) {
        this.itemsFactura = itemsFactura;
    }
}
