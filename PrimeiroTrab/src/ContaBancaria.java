import java.util.Objects;

public abstract class ContaBancaria {

    public Integer numero;
    private Integer senha;
    protected  double saldo;
    public Cliente nometitular;

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }

    public ContaBancaria(Integer numero, Integer senha, Cliente nometitular) {
        this.numero = numero;
        this.senha = senha;
        this.nometitular = nometitular;
    }

    public boolean sacar(double valor , Integer senha){
        if(Objects.equals(this.senha, senha) && (this.saldo-valor) >= 0) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void depositar(Double valor){
        this.saldo += valor;
    }


    public static void Imprimirsaldo(double saldo){
        System.out.println("Seu saldo: " + saldo);
    }


}
