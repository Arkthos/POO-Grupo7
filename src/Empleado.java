public class Empleado {
    private String nombre;
    private int cedula;
    private double salario;
    private String puesto;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public double getSalario() {
        return salario;
    }

    public String getPuesto() {
        return puesto;
    }
}
