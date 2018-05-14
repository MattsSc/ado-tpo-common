package dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ClienteDTO implements Serializable {

    private static final long serialVersionUID = 4914905680856666547L;

    private Integer dni;
    private String nombre;
    private String apellido;
    private String domicilio;
    private String cuit;
    private String razonSocial;
    private float limiteCredito;
    private float montoDisponible;
    private List<MovimientoCCDto> movimientosCC;

    public ClienteDTO(Integer dni, String nombre, String apellido, String domicilio, String cuit, String razonSocial, float limiteCredito, float montoDisponible, List<MovimientoCCDto> movimientosCC) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.limiteCredito = limiteCredito;
        this.montoDisponible = montoDisponible;
        this.movimientosCC = movimientosCC;
    }

    public ClienteDTO(Integer dni, String nombre, String apellido, String domicilio, String cuit, String razonSocial, float limiteCredito, float montoDisponible) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.limiteCredito = limiteCredito;
        this.montoDisponible = montoDisponible;
        this.movimientosCC = new ArrayList<MovimientoCCDto>();
    }

    public void setMovimientosCC(List<MovimientoCCDto> movimientosCC) {
        this.movimientosCC = movimientosCC;
    }

    public Integer getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getCuit() {
        return cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public float getLimiteCredito() {
        return limiteCredito;
    }

    public float getMontoDisponible() {
        return montoDisponible;
    }

    public List<MovimientoCCDto> getMovimientosCC() {
        return movimientosCC;
    }
}
