public class Proveedor {
    private String nombre;
    private String tipoServicio;
    private String infoContacto;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public void setInfoContacto(String infoContacto) {
        this.infoContacto = infoContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public String getInfoContacto() {
        return infoContacto;
    }
}
