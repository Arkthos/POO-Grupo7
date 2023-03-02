public class Venta {
    private int numeroVenta;
    private double montoFacturado;
    private String producto;
    private String metodoPago;
    private String infoComprador;
    private String infoVendedor;
    private String fechaVenta;

    public void setNumeroVenta(int numeroVenta) {
        this.numeroVenta = numeroVenta;
    }

    public void setMontoFacturado(double montoFacturado) {
        this.montoFacturado = montoFacturado;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void setInfoComprador(String infoComprador) {
        this.infoComprador = infoComprador;
    }

    public void setInfoVendedor(String infoVendedor) {
        this.infoVendedor = infoVendedor;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getNumeroVenta() {
        return numeroVenta;
    }

    public double getMontoFacturado() {
        return montoFacturado;
    }

    public String getProducto() {
        return producto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public String getInfoComprador() {
        return infoComprador;
    }

    public String getInfoVendedor() {
        return infoVendedor;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }
}
