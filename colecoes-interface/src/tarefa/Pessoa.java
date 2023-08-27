package tarefa;

public abstract class Pessoa {

    private String nome;

    private String contato;


    public void imprimirNome(){
        System.out.println("Nome: " + this.nome);
    }

    public void imprimirContato(){
        System.out.println("Contato: " + this.contato);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
       this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }


}
