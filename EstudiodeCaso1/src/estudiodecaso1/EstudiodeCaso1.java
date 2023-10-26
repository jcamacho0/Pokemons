package estudiodecaso1;

import javax.swing.JOptionPane;

public class EstudiodeCaso1 {

    public static void main(String[] args) {
        
        //solicitar los datos del cliente
        String nombre = JOptionPane.showInputDialog("Digite el nombre del cliente: ");
        int cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite la cedula del cliente: "));
        //instancia nueva para cliente
        Cliente cliente = new Cliente(nombre, cedula);
        
        int cantidadFacturas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de facturas para el cliente:"));
        
        for (int i = 1; i <= cantidadFacturas; i++) {
            int numFactura = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de factura del cliente: "));
            double montoFactura = Double.parseDouble(JOptionPane.showInputDialog("Digite el monto de la factura:"));
            String mesFactura = JOptionPane.showInputDialog("Digite el mes de la factura: ");
            int anioFactura = Integer.parseInt(JOptionPane.showInputDialog("Digite el anio de la factura:"));
            int estadoFactura = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite el estado de la factura:"
                    + "\n1. Pagado"
                    + "\n2. No pagado"));
            cliente.Factura(numFactura, montoFactura, mesFactura, anioFactura, estadoFactura);
            System.out.println("Factura agregada!");
        }//fin del for
        
        //calcDeudaTot
        double deudaTot = cliente.DeudaTot();
        
        //en cuantos meses se paga
        int meses = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de meses en los que se va realizar el pago: "));
        cliente.planPago(meses);
        
        //imprimir la deuda total
        System.out.println("La deuda total del cliente es: "+ deudaTot);
     

    }//fin de la clase

}//fin del main
