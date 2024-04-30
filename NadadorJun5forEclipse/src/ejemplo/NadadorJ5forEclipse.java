package ejemplo;



public class NadadorJ5forEclipse {


    private String nombre, dNI;
    private int edad, dorsal, valorEjercicio, dificultadEjercicio;


    public NadadorJ5forEclipse(int edad, int valorEjercicio, int dificultadEjercicio) {

        this.edad=edad;
        this.valorEjercicio=valorEjercicio;
        this.dificultadEjercicio=dificultadEjercicio;

    }
    public boolean permisoParticipacion (int edad) {
        if (edad>17) {
            System.out.println("Es mayor de edad, puede participar en la prueba");
            return true;
        }
        System.out.println("Es menor de edad, no puede participar en la prueba");
        return false;
    }

    public int puntuacionFinal (int valorEjercicio, int dificultadEjercicio) {

        int puntuacionFinal= valorEjercicio*dificultadEjercicio;
        return puntuacionFinal;




    }
}

