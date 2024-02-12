package model;

import java.util.ArrayList;

public class Equipo {

    private Double puntuacionMedia;

    private ArrayList<Nadador> listaNadadores;


    public Equipo (){
        this.listaNadadores= new ArrayList<>();
    }

    public void apuntarseEquipo(Nadador nadador){
        if (nadador.getEdad()>18) {
            this.listaNadadores.add(nadador);
            System.out.println("El/La participante "+nadador.getNombre()+" ha sido apuntado al equipo");
        }else {
            System.out.println("El/La participante "+ nadador.getNombre() +" no puede participar por no tener edad legal");
        }
    }
    public void mostrarNadadoresApuntados (){
        for (Nadador nadador:listaNadadores) {
            nadador.mostrarDatos();
        }
    }
    public void calificarNadadores(){
        for (Nadador nadador:listaNadadores) {
            System.out.println(nadador.getNombre());
            double aleatorio= 2.0+ Math.random() * (6.0 - 2.0);
            nadador.puntuacionNadador((float) aleatorio,(float)aleatorio);
        }
    }


    public double puntuacionMedia (){
        int contadorParticipantes=0;
        double puntuacionTotalMomentanea=0.0;

        for (Nadador nadador:listaNadadores) {
            puntuacionTotalMomentanea+=nadador.getPuntuacionFinal();
            contadorParticipantes++;
        }
        puntuacionMedia=puntuacionTotalMomentanea/contadorParticipantes;

        System.out.println("El equipo tuvo "+contadorParticipantes+" participantes");
        System.out.println("La puntuacion media del equipo es: "+puntuacionMedia);
        return puntuacionMedia;

    }

    public Double getPuntuacionMedia() {
        return puntuacionMedia;
    }

    public void setPuntuacionMedia(Double puntuacionMedia) {
        this.puntuacionMedia = puntuacionMedia;
    }

    public ArrayList<Nadador> getListaNadadores() {
        return listaNadadores;
    }

    public void setListaNadadores(ArrayList<Nadador> listaNadadores) {
        this.listaNadadores = listaNadadores;
    }
}
