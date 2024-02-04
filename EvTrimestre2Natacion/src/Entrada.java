import model.Nadador;

public class Entrada {
    public static void main(String[] args) {
        Nadador nadador1 = new Nadador();//fecha con comas
        Nadador nadador2 = new Nadador("Sullivan", "789456m",(int)(Math.random()*999)+1,0.00f, 0.00f);
        Nadador nadador3 = new Nadador("PRUEBILAN", "789456m",(int)(Math.random()*999)+1,0.00f, 0.00f);

    /*
    nadador2.mostrarDatos();
    nadador2.puntuacionNadador(7.17f);
     */
    }
}
