package superclase;

public class Musica {
    String genero;
    
    public Musica (String genero) {
        this.genero = genero;
    }
    
    public void mostrarGenero () {
        System.out.println("Genero: " + this.genero);
    }
}
