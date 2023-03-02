public class Producto {
    private String nombre;
    private int codigoId;
    private String descripcion;
    private double precio;
    private String tipoProducto;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoId(int codigoId) {
        this.codigoId = codigoId;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigoId() {
        return codigoId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }
}
