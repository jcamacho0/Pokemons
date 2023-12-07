package caso.de.estudio.pkg2;

public class Persona {

    public String nombre;
    public double presupuesto;

    public Persona(String nombre, double presupuesto) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void reducirPresupuesto(double cantidad) {
        presupuesto -= cantidad;
    }

}
