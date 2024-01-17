import java.util.Scanner;

public class DebugPrueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(" Numero "+ (i +1)+": " + numero);
        }

        sc.close();
    }

}

