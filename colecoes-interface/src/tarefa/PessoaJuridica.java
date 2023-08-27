package tarefa;

public class PessoaJuridica extends Pessoa{

    private String CNPJ;


    public void imprimirCNPJ(){
        System.out.println("CNPJ: " + this.CNPJ);
    }
    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
}
