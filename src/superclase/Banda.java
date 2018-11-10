package superclase;

public class Banda extends Musica{
    String nombreBanda;
    int formada;
    String[] integrantesActuales;
    
    public Banda (String genero, String nombreBanda, int formada, String[] integrantes) {
        super(genero);
        this.nombreBanda = nombreBanda;
        this.formada = formada;
        this.integrantesActuales = integrantes;
    }
    
    public void mostrarBanda () {
        System.out.println("Nombre banda: " + this.nombreBanda);
        System.out.println("Formada en el año: " + this.formada);
        System.out.println("Integrantes:");
        for (String integrantesActuale : this.integrantesActuales) {
            System.out.println("\t" + integrantesActuale);
        }
    }
}
