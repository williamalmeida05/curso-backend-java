package tarefa;

public class PessoaFisica extends Pessoa{

    private String CPF;


    public void imprimirCPF(){
        System.out.println("CPF: " + this.CPF);
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
