package clase.pkg2;

import javax.swing.JOptionPane;

public class Clase2 {

    public static void main(String[] args) {

//Escriba un nuevo programa en JAVA que le solicite al usuario su
//edad y le indique si puede o no puede votar.
//Considere que en nuestro país, solo las personas con 18 años o
//más pueden votar.
/*
String votar;
int edad;

votar = JOptionPane.showInputDialog("Digite su edad: ");
edad = Integer.parseInt(votar);

if (edad >= 18) {
    System.out.println("Puede votar");
} 
if (edad < 18) {
    System.out.println("No puede votar");
}
         */
//Escriba un nuevo programa en JAVA que le solicite al usuario la
//nota final del curso anterior y le indique si aprobó o no.
//Considere que para aprobar debe obtener una nota igual o
//superior a 70

        /*
String curso;
double nota;

curso = JOptionPane.showInputDialog("Digite su nota final del curso anterior: ");
nota = Double.parseDouble(curso);

if (nota >= 70) {
    System.out.println("Aprobo!");
}

if (nota < 70){
    System.out.println("No aprobo");
}
         */
//Escriba un programa que le solicite al usuario el número de día y le indique el nombre del día.
//Por ejemplo 1 = Domingo, 2 = Lunes, 3 = Martes, 4 = Miércoles, 5 = Jueves, 6 = Viernes, 7 =
//Sábado.
/*
String dias;
int dia;

dias= JOptionPane.showInputDialog("Digite el numero de dia:");
dia= Integer.parseInt(dias);

switch (dia){
    
    case 1:
        System.out.println("El dia es Domingo");
        break;
        
    case 2:
        System.out.println("El dia es lunes");
        break;
    
    case 3:
        System.out.println("El dia es martes");
        break;
        
    case 4:
        System.out.println("El dia es Miercoles");
        break;
    
    case 5:
        System.out.println("El dia es Jueves");
        break;
        
    case 6:
        System.out.println("El dia es Viernes");
        break;
    
    default:
        System.out.println("El dia es Sabado");
        break;     
}
         */
//Escriba un programa que le solicite al usuario 4 números y le muestre cuál es el mayor.
/*
String numeros;
double num1;
double num2;
double num3;
double num4;

numeros= JOptionPane.showInputDialog("Digite el primer numero: ");
num1= Double.parseDouble(numeros);

numeros= JOptionPane.showInputDialog("Digite el segundo numero: ");
num2= Double.parseDouble(numeros);

numeros= JOptionPane.showInputDialog("Digite el tercer numero: ");
num3= Double.parseDouble(numeros);

numeros= JOptionPane.showInputDialog("Digite el cuarto numero: ");
num4= Double.parseDouble(numeros);

double mayor= num1;

if (num2 > mayor){
    mayor = num2;
}

if (num3 > mayor){
    mayor = num3;
}

if (num4 > mayor){
    mayor = num4;
}

if (mayor == num1){
    System.out.println("El primer numero digitado " + num1 + " es el mayor.");
} else if (mayor == num2){
    System.out.println("El segundo numero ingresado " + num2 + " es el mayor.");
} else if (mayor == num3){
    System.out.println("El tercer numero ingresado " + num3 + " es el mayor.");
} else {
    System.out.println("El cuarto numero ingresado " + num4 + " es el mayor.");
}
         */
//Desarrolle un ejercicio que le solicite al usuario los años de antigüedad, la
//cantidad de horas laboradas por semana y el precio que se le paga por
//hora, con estos datos debe calcular el salario bruto.
//• Si el usuario tiene más de 10 años de trabajar para la empresa, se le
//dará un bono del 20% de su salario bruto, si este nuevo salario bruto es
//superior a $1000 debe hacerse una deducción del 10%, pero si el salario
//supera los $2000, esta deducción será del 15%. Muestre al usuario el
//salario neto final.
String trabajo;
int anios;
int horas;
int precio;

trabajo = JOptionPane.showInputDialog("Digite la cantidad de anios que has estado con la compania:");
anios = Integer.parseInt(trabajo);

trabajo = JOptionPane.showInputDialog("Digite la cantidad de horas laboradas por semana:");
horas = Integer.parseInt(trabajo);

trabajo = JOptionPane.showInputDialog("Digite el precio que se le paga por hora:");
precio = Integer.parseInt(trabajo);

double bruto = horas * precio * 4;// calculando el salario bruto por mes

if (anios > 10) {
    bruto += bruto * 0.20;//anadir el 20% si cumple mas q 10 anios
}
if (bruto > 1000) {
    bruto -= bruto * 0.10;//deduccion del 10%
}

if (bruto > 2000) {
    bruto -= bruto * 0.15;//deduccion del 15%
}

JOptionPane.showMessageDialog(null, "El salario final es: " + bruto);
        System.out.println("El salario neto es: "+bruto);

    }

}
