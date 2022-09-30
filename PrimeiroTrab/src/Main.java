public class Main {

    public static void main(String[] args) {

        Cliente joao = new ClientePF("joao", "silva", "rua x", "1613213123");
        Cliente atacadao = new ClientePJ("atacadao", "ltda", "rua y", "31231231231321");


        ContaBancaria cc = new ContaCorrente(20,200, joao, -200);
        cc.depositar(1000.00);
        ContaBancaria cp = new ContaPoupanca(20,200, atacadao, 1.00);
        cp.depositar(500.00);

        cc.depositar(390.00);
        ContaBancaria.Imprimirsaldo(cc.saldo);

        cp.depositar(900.00);
        ContaBancaria.Imprimirsaldo(cp.saldo);

        cc.sacar(40.00, 200);
        ContaBancaria.Imprimirsaldo(cc.saldo);


        cp.sacar(50, 200);
        ContaBancaria.Imprimirsaldo(cp.saldo);
    }

}
