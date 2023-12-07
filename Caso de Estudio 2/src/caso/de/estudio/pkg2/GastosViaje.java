
package caso.de.estudio.pkg2;


public class GastosViaje {
    private Persona[] personas;
    private StringBuilder movimientos;

    public GastosViaje(Persona[] personas) {
        this.personas = personas;
        this.movimientos = new StringBuilder();
    }

    public void agregarMovimiento(String movimiento) {
        movimientos.append(movimiento).append("\n");
    }

    public void mostrarMovimientos() {
        System.out.println("Movimientos:\n" + movimientos.toString());
    }
    
    
}//end of class
