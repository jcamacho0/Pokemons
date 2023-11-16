
package quiz.pkg2;

import javax.swing.JOptionPane;


public class Feligreses {
    
    public String nameFel;//name of the feligreses
    public int cedulaFel;//cedula de los feligreses
    public int diezmoFel = 0;//diezmo de los feligreses

    //constructor
    public Feligreses(String nameFel, int cedulaFel) {
        this.nameFel = nameFel;
        this.cedulaFel = cedulaFel;
    }

    Feligreses() {//constructor vacio
    }

    
    //getters y setters
    public String getNameFel() {
        return nameFel;
    }

    public void setNameFel(String nameFel) {
        this.nameFel = nameFel;
    }

    public int getCedulaFel() {
        return cedulaFel;
    }

    public void setCedulaFel(int cedulaFel) {
        this.cedulaFel = cedulaFel;
    }

    public int getDiezmoFel() {
        return diezmoFel;
    }

    public void setDiezmoFel(int diezmoFel) {
        this.diezmoFel = diezmoFel;
    }
    
    //method for inputing info
    public void input(){
        nameFel = JOptionPane.showInputDialog("Digite el nombre del feligres:");
        cedulaFel = Integer.parseInt(JOptionPane.showInputDialog("Digite la cedula del Feligres:"));
        diezmoFel = Integer.parseInt(JOptionPane.showInputDialog("Digite el diezmo del feligres: "));
    }
    
    
    
}//fin de la clase
