package dtos;

public class ProveedorDTO {
    private Integer id;
    private String nombre;
    private int cuit;

    public ProveedorDTO(Integer id, String nombre, int cuit) {
        this.id = id;
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }
}
