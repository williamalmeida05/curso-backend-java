public class Gravadora {
    public String nome;
    public String cidade;
    public int quantidadeDeArtista;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getQuantidadeDeArtista() {
        return quantidadeDeArtista;
    }

    public void setQuantidadeDeArtista(int quantidadeDeArtista) {
        this.quantidadeDeArtista = quantidadeDeArtista;
    }

    public String informarCidade(){
        return "Cacoal";
    }
}