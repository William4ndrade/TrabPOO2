import java.util.Objects;

public class ContaCorrente  extends ContaBancaria implements Tributavel{

    public double LimiteEspecial;

    public ContaCorrente(Integer numero, Integer senha, Cliente nometitular, double limiteEspecial) {
        super(numero, senha, nometitular);
        LimiteEspecial = limiteEspecial;
    }

    @Override
    public boolean sacar(double valor, Integer senha) {
        if(Objects.equals(this.getSenha(), senha)){
            double newvalue = this.saldo - valor;
            if(newvalue >= LimiteEspecial){
                this.saldo -= valor;
                return true;
            }

        }
        return false;
    }

    @Override
    public double getValorImposto() {
        return this.saldo * 0.01;
    }
}
