public class ContaPoupanca extends ContaBancaria {

    public Double Taxarend;

    public ContaPoupanca(Integer numero, Integer senha, Cliente nometitular, Double taxarend) {
        super(numero, senha, nometitular);
        Taxarend = taxarend;
    }


}
