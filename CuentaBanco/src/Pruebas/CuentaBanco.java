package Pruebas;

public class CuentaBanco {
    private int saldo;
    private String password;

    public CuentaBanco(int saldoInicial, String password) {// objeto generico
        this.saldo = saldoInicial;
        this.password = password;
    }

    public int ingresar(int cantidad) { //metod ingresar dinero


        if (saldo >= cantidad) {
            saldo += cantidad;
            return saldo;
        } else
            return -1;// saber si da error al hacer coverage
    }

    public int retirar(int cantidad, String pass) { //metod Sacar dinero

        if (passwordCorrecta(pass)) { // tras hacer el metodo paswordCorrecta podemos llamar  al metodo del boolean
            if (saldo >= cantidad) {
                saldo -= cantidad;
            } else
                return -1;// da error y no te permite si el saldo no es mayor a la cantidad
        }
        return -2; //este if corresponde a la passwors, si es incorrecta -2
    }

    public boolean passwordCorrecta(String password) {
        return password.equals(password);
    }

    public static void main(String[] args) {

    }
}
