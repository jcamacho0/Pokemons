package spotify;

public class Cancion {
    
//variables
    private String titulo, autor;
    private int idCancion, anioCreacion;
    private double duracion;
    
//constructor
    public Cancion(String titulo, String autor, int idCancion, int anioCreacion, double duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.idCancion = idCancion;
        this.anioCreacion = anioCreacion;
        this.duracion = duracion;
    }//fin de constructor
    
//setters y getters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(int idCancion) {
        this.idCancion = idCancion;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

}//fin de la clase cancion
