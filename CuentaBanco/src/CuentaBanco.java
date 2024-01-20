public class CuentaBanco {
    private int saldo;
    private String password;

    public CuentaBanco (int saldoInicial, String password){// objeto generico
        this.saldo=saldoInicial;
        this.password=password;
    }

    public int retirar (int cantidad, String passwordIntro){ //metod Sacar dinero

        if (password.equals(passwordIntro)){ // tras hacer el metodo paswordCorrecta podemos meterle (paswordCorrecta(passwordIntro)) en el parentesis
            if (saldo>=cantidad){
                saldo-=cantidad;
            }else
                return -1;// da error y no te permite si el saldo no es mayor a la cantidad
        }
        return -2; // si la contraseña es falsa
    }

    public boolean passwordCorrecta ( String passwordIntro) {
        return password.equals(passwordIntro);
    }

    public static void main(String[] args) {

    }
}
