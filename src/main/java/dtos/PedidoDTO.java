package dtos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class PedidoDTO implements Serializable {

    private static final long serialVersionUID = -6097300428862144938L;
    private Integer id;
    private ClienteDTO cliente;
    private Date fechaSolicitudOrden;
    private Date fechaDespacho;
    private Date fechaEntrega;
    private String estado;
    private String direccionEntrega;
    private String aclaracion;
    private List<ItemPedidoDTO> items;

    public PedidoDTO(Integer id, ClienteDTO cliente, Date fechaSolicitudOrden, Date fechaDespacho, Date fechaEntrega, String estado, String direccionEntrega, String aclaracion, List<ItemPedidoDTO> items) {
        this.id = id;
        this.cliente = cliente;
        this.fechaSolicitudOrden = fechaSolicitudOrden;
        this.fechaDespacho = fechaDespacho;
        this.fechaEntrega = fechaEntrega;
        this.estado = estado;
        this.direccionEntrega = direccionEntrega;
        this.aclaracion = aclaracion;
        this.items = items;
    }

    public PedidoDTO(ClienteDTO cliente, String direccionEntrega, List<ItemPedidoDTO> items) {
        this.cliente = cliente;
        this.direccionEntrega = direccionEntrega;
        this.items = items;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ClienteDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }

    public Date getFechaSolicitudOrden() {
        return fechaSolicitudOrden;
    }

    public void setFechaSolicitudOrden(Date fechaSolicitudOrden) {
        this.fechaSolicitudOrden = fechaSolicitudOrden;
    }

    public Date getFechaDespacho() {
        return fechaDespacho;
    }

    public void setFechaDespacho(Date fechaDespacho) {
        this.fechaDespacho = fechaDespacho;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public String getAclaracion() {
        return aclaracion;
    }

    public void setAclaracion(String aclaracion) {
        this.aclaracion = aclaracion;
    }

    public List<ItemPedidoDTO> getItems() {
        return items;
    }

    public void setItems(List<ItemPedidoDTO> items) {
        this.items = items;
    }
}
