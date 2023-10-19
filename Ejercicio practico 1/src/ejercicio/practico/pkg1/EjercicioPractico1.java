package ejercicio.practico.pkg1;

import javax.swing.JOptionPane;

public class EjercicioPractico1 {

    public static void main(String[] args) {

        int numEmpleados;
        double SEM = 0, IVM = 0, CCSS = 0, salario;

        numEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de empleados en la empresa: "));

        for (int i = 1; i <= numEmpleados; i++) {
            salario = Double.parseDouble(JOptionPane.showInputDialog("Digite el Salario del empleado " + i + ":"));

                SEM = salario * 0.0925;
                IVM = salario * 0.0508;
                CCSS = salario + SEM + IVM;
            

        }
        JOptionPane.showMessageDialog(null, "La empresa deberia abonar el monto de " + CCSS
                + " por concepto de SEM Y IVM.");
    }//fin del main

}//fin de la clase
