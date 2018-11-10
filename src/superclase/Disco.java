package superclase;

public class Disco extends Banda {
    String nombreDisco;
    int lanzamiento;
    String[][] cancionesYduracion;
    
    public Disco (String genero, String nombreBanda, int formada, String[] integrantes, String nombreDisco, int lanzamiento, String[][] cancionesYduracion) {
        super(genero, nombreBanda, formada, integrantes);
        this.nombreDisco = nombreDisco;
        this.lanzamiento = lanzamiento;
        this.cancionesYduracion = cancionesYduracion;
    }
    
    public void mostrarDisco () {
        System.out.println("Nombre disco: " + this.nombreDisco);
        System.out.println("Lanzamiento: " + this.lanzamiento);
        System.out.println("Canciones:");
        for (int j = 0; j < this.cancionesYduracion[0].length; j++) {
            System.out.println("\t" + this.cancionesYduracion[0][j] + "--->" + this.cancionesYduracion[1][j]);
        }
    }
    
}
