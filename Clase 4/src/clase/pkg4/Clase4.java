
package clase.pkg4;

import javax.swing.JOptionPane;


public class Clase4 {

    public static void main(String[] args) {

        //crear un objeto de carro
        Carro num1 = new Carro();
        
        //darle valor a los atri de carro num1
        num1.modelo="Nissan";
        num1.anio=2019;
        num1.color="azul";
        num1.tamanio="Sedan";
        
        //mostrar a info de carro num1
        JOptionPane.showMessageDialog(null,
                "\nModelo: " + num1.modelo +
                "\nAnio: " + num1.anio +
                "\nColor: " + num1.color +
                "\nTamanio: " + num1.tamanio);
        
        //mothod de carro parqueando
        num1.carroseparquea();

        
       
        
     
    }//final del main
    
}//fin del clase
