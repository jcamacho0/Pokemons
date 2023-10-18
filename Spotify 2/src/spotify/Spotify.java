package spotify;

import javax.swing.JOptionPane;

public class Spotify {

    public static void main(String[] args) {

        //asignar las variables
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite el Id de la cancion que deseas ingresar: "));
        String titulo = JOptionPane.showInputDialog("Digite el titulo de la cancion que deseas ingresar: ");
        String autor = JOptionPane.showInputDialog("Digite el nombre del autor de la cancion que deseas ingresar: ");
        double duracion = Double.parseDouble(JOptionPane.showInputDialog("Digite la duracion de la cancion que deseas ingresar: "));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Digite el anio de creacion de la cancion que deseas ingresar: "));

        //crear una nuave instancia de cancion
        Cancion cancion = new Cancion(titulo, autor, id, anio, duracion);

        //mostrar
        JOptionPane.showMessageDialog(null,
                "Los datos de la cancion " + cancion.getTitulo()
                + " es: "
                + "\n El Id: " + cancion.getIdCancion()
                + "\n El titulo: " + cancion.getTitulo()
                + "\n El autor: " + cancion.getAutor()
                + "\n La duracion: " + cancion.getDuracion()
                + "\n El anio de creacion: " + cancion.getAnioCreacion());
    }//fin del main

}//fin de la clase
