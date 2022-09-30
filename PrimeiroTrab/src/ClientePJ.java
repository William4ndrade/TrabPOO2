public class ClientePJ extends Cliente{


    private String cnpj;

    public ClientePJ(String nome, String sobrenome, String endereco, String cnpj) {
        super(nome, sobrenome, endereco);
        this.cnpj = cnpj;
    }
}
