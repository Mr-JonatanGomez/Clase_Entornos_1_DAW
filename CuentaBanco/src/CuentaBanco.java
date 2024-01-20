public class CuentaBanco {
    private int saldo;
    private String password;

    public CuentaBanco (int saldoInicial, String password){
        this.saldo=saldoInicial;
        this.password=password;
    }

    public int retirar (int cantidad, String passwordIntro){

        if (password.equals(passwordIntro)){
            if (saldo>=cantidad){
                saldo-=cantidad;
            }else
                return -1;// da error y no te permite si el saldo no es mayor a la cantidad
        }
        return -2; // si la contraseña es falsa
    }

    public boolean

    public static void main(String[] args) {

    }
}
