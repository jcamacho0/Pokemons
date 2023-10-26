package estudiodecaso1;

public class Cliente {

    public String nombre;
    public int cedula;
    public double deuda;

    public Cliente(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.deuda = 0.0;
    }//fin de const

    //metodo para agregar una factura al cliente
    public void Factura(int numFactura, double monto, String meses, int anio, int estado) {
        if (estado == 2) {
            deuda += monto;
        }//fin de if
    }//fin del metodo

    //obtener la deuda del cliente
    public double DeudaTot() {
        return deuda;
    }//fin del metodo

    //metodo de plan de pago
    public void planPago(int meses) {
        double interes = deuda * 0.05;
        double cuotaMensual = (interes + deuda) / meses;
        System.out.println("Plan de pago para " + nombre + ", Cedula: " + cedula);
        for (int cuota = 1; cuota <= meses; cuota++) {
            System.out.println("Cuota " + cuota + ": " + cuotaMensual + "Fecha de pago: " + FechaDePago(cuota));

        }
    }

    public String FechaDePago(int cuota) {
        int mesFactura = 1;
        int anioFactura = 2023;
        int mes = mesFactura + cuota - 1;
        int anio = anioFactura + (mes / 12);
        if (mes == 0) {
            mes = 12;
        }
        return mes + "/" + anio;
    }

    }//fin de la clase
