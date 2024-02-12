import model.Equipo;
import model.Nadador;

import java.util.Date;

public class Entrada {

    public static void main(String[] args) {

        Nadador nadador1 = new Nadador("Niurka Montalvo", "789456s",27,(int)(Math.random()*999)+1,0.00f, 0.00f);
        Nadador nadador2 = new Nadador("Yago Lamela", "123456s",37,(int)(Math.random()*999)+1,0.00f, 0.00f);
        Nadador nadador3 = new Nadador("Gemma Mengual", "234567n",17,(int)(Math.random()*999)+1,0.00f, 0.00f);
        Nadador nadador4 = new Nadador("Jordi Ferron", "456789f",47,(int)(Math.random()*999)+1,0.00f, 0.00f);
        Nadador nadador5 = new Nadador("Yago Lamela", "123456s",26,(int)(Math.random()*999)+1,0.00f, 0.00f);

        Equipo losMezclados = new Equipo();

        losMezclados.apuntarseEquipo(nadador1);
        losMezclados.apuntarseEquipo(nadador2);
        losMezclados.apuntarseEquipo(nadador3);
        losMezclados.apuntarseEquipo(nadador4);
        losMezclados.apuntarseEquipo(nadador5);

        losMezclados.mostrarNadadoresApuntados();
        losMezclados.calificarNadadores();
        losMezclados.puntuacionMedia();
        // los que sean mayor de edad seran listados en el equipo
    }
}
