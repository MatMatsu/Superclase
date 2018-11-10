package superclase;

public class SuperClase {

    public static void main(String[] args) {
        String[] bandaUno = {"Anthony Kiedis", "Flea", "Chad Smith", "Josh Klinghoffer"};
        String[][] discoUno = {{"Around the World", "Parallel Universe", "Scar Tissue", "Otherside", "Get on Top", "Californication", "Easily", "Porcelain", "Emit Remmus", "I Like Dirt", "This Velvet Glove", "Savior", "Purple Stain", "Right on Time", "Road Trippin"},
                                {"3\'58\"", "4\'30\"", "3\'37\"", "4\'15\"", "3\'18\"", "5\'21\"", "3\'51\"", "2\'43\"", "4\'00\"", "2\'37\"", "3\'45\"", "4\'52\"", "4\'13\"", "1\'52\"", "3\'25\""}};

        Disco californication = new Disco("Funk rock", "Red Hot Chili Peppers", 1983, bandaUno, "Californication", 1999, discoUno);
        
        californication.mostrarGenero();
        californication.mostrarBanda();
        californication.mostrarDisco();
    }
    
}
