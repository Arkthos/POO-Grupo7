import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nombre;
    private String ubicacion;
    private List<String> empleados = new ArrayList<>();
    private List<String> clientes = new ArrayList<>();
    private List<String> proveedores = new ArrayList<>();
    private List<String> productos = new ArrayList<>();
    private List<String> ventas = new ArrayList<>();

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setEmpleados(List<String> empleados) {
        this.empleados = empleados;
    }

    public void setClientes(List<String> clientes) {
        this.clientes = clientes;
    }

    public void setProveedores(List<String> proveedores) {
        this.proveedores = proveedores;
    }

    public void setProductos(List<String> productos) {
        this.productos = productos;
    }

    public void setVentas(List<String> ventas) {
        this.ventas = ventas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public List<String> getEmpleados() {
        return empleados;
    }

    public List<String> getClientes() {
        return clientes;
    }

    public List<String> getProveedores() {
        return proveedores;
    }

    public List<String> getProductos() {
        return productos;
    }

    public List<String> getVentas() {
        return ventas;
    }
}
