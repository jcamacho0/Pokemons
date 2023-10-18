package clase.pkg5.tarea;

import javax.swing.JOptionPane;

public class Clase5Tarea {

    public static void main(String[] args) {

        int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite la opcion que quieres realizar: "
                + "\n1(calculadora, suma, resta, multiplicacion y division)"
                + "\n2 (La suma de 4 parametros y su promedio)"
                + "\n3 (Calcular la area de un cuadrado)"
                + "\n4 (imprimir los datos de una persona)"));

        switch (opcion) {
            case 1:
                calculadora();
                break;

            case 2:
                promedio();
                break;
                
            case 3:
                area();
                break;

            case 4:
                ingreseInfo();
                break;

            default:
                throw new AssertionError();
        }//fin del switch
    }//fin del main
    
//metodo 1 calculadora que tenga 3 parametros un string (suma, resta divicion, multiplicacion ) que los parametros sean doubles
    public static void calculadora() {
        double a, b;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer numero: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo numero: "));

        int calculacion = Integer.parseInt(JOptionPane.showInputDialog("Digite la opcion que deseas realizar: \n1(suma), \n2 (resta), \n3 (multiplicacion), o \n4(divicion): "));

        double suma = a + b, resta = a - b, multiplicacion = a * b, divicion = a / b;

        switch (calculacion) {
            case 1:
                System.out.println("La suma de  " + a + " + " + b + " es: " + suma);
                break;

            case 2:
                System.out.println("la resta de  " + a + " - " + b + " es: " + resta);
                break;

            case 3:
                System.out.println("La multiplicacion de  " + a + " x " + b + " es: " + multiplicacion);
                break;

            case 4:
                System.out.println("La divicion de " + a + " / " + b + " es: " + divicion);
                break;

            default:
                throw new AssertionError();
        }//fin del switch
    }//fn del metodo calculadora

    //metodo 2 que sume 4 parametros y me saque el promedio
    public static void promedio() {

        int num1, num2, num3, num4;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero entero:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero entero:"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite el tercer numero entero:"));
        num4 = Integer.parseInt(JOptionPane.showInputDialog("Digite el ultimo numero entero:"));

        int suma = num1 + num2 + num3 + num4;//sumar los numeros

        double promedio = (double) suma / 4;//sacar el promedio

        JOptionPane.showMessageDialog(null, "\nLa suma de los numeros es  " + suma + ". \nEl promedio de los numeros es " + promedio + ".");
        System.out.println("La suma de los numeros es: " + suma + ". \nEl promedio de los numeros es: " + promedio);
    }//fin de metodo promedio

    //metodo 3 calcule el area de un cuadrado
    public static void area() {

        double num = Double.parseDouble(JOptionPane.showInputDialog("Digite los centimetros de un lado del cuadrado: "));

        double area = num * num;//sacar el area

        JOptionPane.showMessageDialog(null, "El area de su cuadrado es: " + area);
    }//fin del metodo 3

    //metodo 4, crear un methodo que pida los datos de una persona ced, nombre, telefono y lo imprima por consola;
    public static void ingreseInfo() {

        int cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite la cedula de la persona: "));
        String nombre = JOptionPane.showInputDialog("Digite el nombre de la persona: ");
        int telefono = Integer.parseInt(JOptionPane.showInputDialog("Digite el telefono de la persona: "));

        JOptionPane.showMessageDialog(null,
                    "\nCedula: " + cedula
                + "\nNombre: " + nombre
                + "\nTelefono: " + telefono);
    }//fin del metodo ingreseInfo

}//fin del class
