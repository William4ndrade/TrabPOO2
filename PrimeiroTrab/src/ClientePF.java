public class ClientePF extends Cliente {

    private String cpf;


    public ClientePF(String nome, String sobrenome, String endereco, String cpf) {
        super(nome, sobrenome, endereco);
        this.cpf = cpf;
    }
}
