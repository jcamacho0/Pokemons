package clase.pkg3;

import javax.swing.JOptionPane;

public class Clase3 {

    public static void main(String[] args) {//Principio del main

        /*
//Desarrolle un nuevo proyecto que muestre un rectángulo
//de 10 símbolos @ en 5 líneas.

for (int i = 1; i <=5; i++) {
    System.out.println("@@@@@@@@@@");

}//fin del ciclo for
         */
//Desarrolle un nuevo proyecto que le solicite al usuario un número
//y muestre la tabla de multiplicar de dicho número.
/*

int numero;
numero= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a multiplicar:"));

for (int i = 1; i < 11; i++) {
    System.out.println(numero+ " x " + i + " = " + i * numero);
}//fin del ciclo for
         */
//Desarrolle un programa que solicite un valor y dibuje un triángulo
//con el número de filas indicado.
/*
int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor"));

for (int i = 1; i <= valor; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
  
    }//fin del for j
    System.out.println("\n ");//salto de linea
}//fin del for i
         */
 /*
//Desarrolle un programa que le muestre al usuario los valores
//entre 20 y 30 (inclusive) y su correspondiente valor al
//cuadrado.

int valor;

    System.out.println("Valores entre 20 y 30 (inclusive) y sus cuadrados:");
        
        for (int i = 20; i <= 30; i++) {
            valor = i * i;
            System.out.println(i + " al cuadrado es " + valor);
}//fin del for
         */
 /*
//Desarrolle un programa que solicite una cantidad de
//estudiantes y posteriormente solicite la nota para cada uno de
//ellos. Calcule la nota promedio, la nota mayor, la nota menor y la
//cantidad de estudiantes aprobados. Se aprueba al menos con
//70     
        int numEstudiantes;
        double notaTotal = 0;
        int estAprobados = 0;
        double average;
        double notaMax = 0;
        double notaMin = 100;

        numEstudiantes = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de estudiantes"));

        for (int i = 1; i <= numEstudiantes; i++) {
            double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del estudiante " + i + ":"));
            notaTotal += nota;

            if (nota >= 70) {
                estAprobados++;
            }//fin del if

            if (nota > notaMax) {
                notaMax = nota;
            }//fin del if

            if (nota < notaMin) {
                notaMin = nota;
            }
        }//fin del for

        average = notaTotal / numEstudiantes;

        JOptionPane.showMessageDialog(null,
                "\nNota promedio: " + average
                + "\nNota mayor: " + notaMax
                + "\nNota menor: " + notaMin
                + "\nCantidad de estudiantes aprovados: " + estAprobados);
         */
 
//Modifique el ejercicio anterior para que no se tenga que definir
//la cantidad de estudiantes, sino que, cuando la nota ingresada
//sea negativa, se deje de solicitar la información.
        double notaTotal = 0;
        int estAprobados = 0;
        double average;
        double notaMax = 0;
        double notaMin = 100;

        int i = 0; 

        while (true) {
            i++; 
            double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del estudiante " + i + ":"));


            if (nota < 0) {
                break;
            }//fin del if

            notaTotal += nota;

            if (nota >= 70) {
                estAprobados++;
            }//fin del if

            if (nota > notaMax) {
                notaMax = nota;
            }//fin del if

            if (nota < notaMin) {
                notaMin = nota;
            }//fin del if
        }//fin del while


        if (i > 0) {
            average = notaTotal / i;
        } else {
            average = 0;
        }//fin del else

        JOptionPane.showMessageDialog(null,
                "\nNota promedio: " + average
                + "\nNota mayor: " + notaMax
                + "\nNota menor: " + notaMin
                + "\nCantidad de estudiantes aprobados: " + estAprobados);

    }//fin del main

}//fin de clase
