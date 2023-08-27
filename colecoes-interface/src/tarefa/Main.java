package tarefa;

public class Main {
    public static void main(String args[]){
        System.out.println("***** Pessoa Física *****\n");
        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Will");
        pf.setContato("9101-2409");
        pf.setCPF("789.456.123-86\n");

        imprimir(pf);

        System.out.println("***** Pessoa Jurídica *****\n");

        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Almeida");
        pj.setContato("3441-2323");
        pj.setCNPJ("29.665.054/0001-58");

        imprimir(pj);
    }

    public static void imprimir(Pessoa pessoa) {
        pessoa.imprimirNome();
        pessoa.imprimirContato();

        if (pessoa instanceof PessoaFisica) {
            ((PessoaFisica) pessoa).imprimirCPF();
        } else if (pessoa instanceof PessoaJuridica) {
            ((PessoaJuridica) pessoa).imprimirCNPJ();
        }
    }
}
