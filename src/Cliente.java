public class Cliente {
    private String nombre;
    private int cedula;
    private String direccion;
    private String numeroTelefonico;
    private String correoElectronico;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }
    
}
