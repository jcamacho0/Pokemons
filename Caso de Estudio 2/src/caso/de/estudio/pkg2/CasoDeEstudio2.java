package caso.de.estudio.pkg2;

import javax.swing.JOptionPane;

public class CasoDeEstudio2 {

    public static void main(String[] args) {

        Persona[] personas = {
            new Persona("Joshua", 100.0),
            new Persona("Greivin", 100.0),
            new Persona("Guillermo", 100.0),
            new Persona("Andres", 100.0),
            new Persona("Tavo", 100.0),
            new Persona("David", 100.0)
        };

        GastosViaje gastosViaje = new GastosViaje(personas);

        int numeroCuenta = 1;

        boolean salir = false;
        while (!salir) {
            //datos fijos
            String cuenta = "Comida" + numeroCuenta;
            String moneda = "Dolares";

            double total = 0.0;

            //solicitar datos especificos
            String descripcion = JOptionPane.showInputDialog("Digite la Descripcion (comida o restaurante):");

            //solicitar la cantidad de personas en la cuenta
            int cantidadPersonas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de personas en la cuenta" + cuenta));

            //solicitar participantes uno por uno
            StringBuilder participantesBuilder = new StringBuilder();
            for (int i = 0; i < cantidadPersonas; i++) {
                String participante = JOptionPane.showInputDialog("Ingrese el nombre del participante " + (i + 1) + " en la cuenta " + cuenta);
                participantesBuilder.append(participante).append(", ");
            }//end of for
            String participantes = participantesBuilder.toString().trim().replaceAll(",$", ""); //eliminar las ultimas coma y espacio

            //solicitar quien pago
            String quienPago = "";
            boolean esValido = false;
            while (!esValido) {
                quienPago = JOptionPane.showInputDialog("Ingrese quien pago (debe ser uno de los participantes en la cuenta " + cuenta + "):");
                for (Persona persona : personas) {
                    if (persona.getNombre().equalsIgnoreCase(quienPago)) {
                        esValido = true;
                        break;
                    }//end of if
                }//end of for

                if (!esValido) {
                    System.out.println("Error: quien pago no es un participante valido.");
                }//end of if

            }//en of while

            //solicitar el monto total
            String montoTotalStr = JOptionPane.showInputDialog("digite el monto total:");
            total = Double.parseDouble(montoTotalStr);

            //realizar la division equitativa
            realizarDivisionEquitativa(personas, participantes, total);

            //agragar movimiento
            gastosViaje.agregarMovimiento("Movimiento: Cuenta " + cuenta + ", Numero de Cuenta " + numeroCuenta);
            gastosViaje.agregarMovimiento("Descripcion: " + descripcion);
            gastosViaje.agregarMovimiento("Participantes: " + participantes);
            gastosViaje.agregarMovimiento("Quien Pago: " + quienPago);
            gastosViaje.agregarMovimiento("Monto total: $" + total);
            gastosViaje.agregarMovimiento("Moneda: " + moneda);

            //mostrar deudas
            mostrarDeudas(personas, participantes, quienPago);

            //preguntar 
            String continuar = JOptionPane.showInputDialog("¿Desea agregar otro gasto? (Si/No)");
            if (continuar.equalsIgnoreCase("No")) {
                salir = true;
            }//end of if

            //aumentar
            numeroCuenta++;
        }//end of while

        //mostrar resultados al final del programa
        System.out.println("Presupuestos finales:\n" + obtenerPresupuestos(personas));
        gastosViaje.mostrarMovimientos();

    }//end of class

    private static void realizarDivisionEquitativa(Persona[] personas, String participantes, double total) {
        String[] nombresParticipantes = participantes.split(", ");

        //calcular la division equitativa
        double divisionEquitativa = total / nombresParticipantes.length;

        //actualizar presupuestos
        for (Persona persona : personas) {
            for (String nombre : nombresParticipantes) {
                if (nombre.trim().equalsIgnoreCase(persona.getNombre())) {
                    persona.reducirPresupuesto(divisionEquitativa);
                }
            }
        }
    }

    private static void mostrarDeudas(Persona[] personas, String participantes, String quienPago) {
        String[] nombresParticipantes = participantes.split(", ");

        for (Persona persona : personas) {
            for (String nombre : nombresParticipantes) {
                if (nombre.trim().equalsIgnoreCase(persona.getNombre())) {
                    if (!nombre.equalsIgnoreCase(quienPago)) {
                        double deuda = persona.getPresupuesto();
                        System.out.println(nombre + " le debe a " + quienPago + " un total de $" + deuda);
                    }
                }
            }
        }
    }

    private static String obtenerPresupuestos(Persona[] personas) {
        StringBuilder resultado = new StringBuilder("Nombre\tPresupuesto\n");
        for (Persona persona : personas) {
            resultado.append(persona.getNombre()).append("\t$").append(persona.getPresupuesto()).append("\n");
        }
        return resultado.toString();
    }

}//end of main
