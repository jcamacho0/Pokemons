package quiz.pkg2;

import javax.swing.JOptionPane;

public class Quiz2 {

    public static void main(String[] args) {

        //new instancias
        Iglesia iglesia = new Iglesia(JOptionPane.showInputDialog("Digite el nombre de la Iglesia:"));
        Pastor pastor = new Pastor(JOptionPane.showInputDialog("Digite el nombre del pastor:"));

        //asks for the amount of feligreses
        int amountFel = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de feligreses: "));
        Feligreses[] feligreses = new Feligreses[amountFel];//creating a new arreglo for multiple feligreses

        //variables para los impuestos
        double mun = 0, fam = 0, pas = 0;

        for (int i = 0; i <= amountFel; i++) {
            Feligreses feligres = new Feligreses();
            feligres.input();//call the method to input info
            feligreses[i] = feligres;

            //subtract the impuestos
            mun = feligres.diezmoFel * 0.9;//impuesto del 9 % que será para las municipalidades el cual será utilizado para infraestructura
            fam = feligres.diezmoFel * 0.21;// impuesto del 21% que será destinado para las familias pobres de la comunidad en un comedor.
            pas = feligres.diezmoFel * 0.70;//pastor tendrá un 70% de ganancias del diezmo total.

        }//fin del for
        //for para mostrar info
        for (int i = 0; i <= amountFel; i++) {
            JOptionPane.showMessageDialog(null, "El monto total de ganancias de la iglesia: " + feligreses[i].diezmoFel
                    + "\nEl monto para la municipalidad infraestructura: " + mun
                    + "\nEl monto para el comedor municipal: " + fam
                    + "\nEl monto de ganancia para el pastor." + pas
                    + "\nLa lista de nombres y cédulas de las personas que el diezmo con valor 0: "
                    + "\nLa lista de nombres y cédulas de las personas con diezmo mayor a 100000: ");
        }

    }//fin del main

}//fin de la clase
