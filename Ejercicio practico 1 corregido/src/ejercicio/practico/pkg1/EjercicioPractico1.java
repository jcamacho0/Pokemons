package ejercicio.practico.pkg1;

import javax.swing.JOptionPane;

public class EjercicioPractico1 {

    public static void main(String[] args) {
        //variables
        int numEmpleados;
        double SEM = 0, IVM = 0, CCSS = 0, salario;
        
        numEmpleados = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite la cantidad de empleados en la empresa: "));
        //for para crear ciclo de la cantidad de empleados ingresados
        for (int i = 1; i <= numEmpleados; i++) {
            salario = Double.parseDouble(JOptionPane.showInputDialog(
                    "Digite el Salario del empleado " + i + ":"));

            SEM = salario * 0.0925;//calculo de rebajas
            IVM = salario * 0.0508;
            CCSS += SEM + IVM;//sumar las rebajas de cada empleado
        }//fin del for
        
        JOptionPane.showMessageDialog(null, 
                "La empresa deberia abonar el monto de " + CCSS
                + " por concepto de SEM Y IVM.");//mostrar el resultado
    }//fin del main

}//fin de la clase
