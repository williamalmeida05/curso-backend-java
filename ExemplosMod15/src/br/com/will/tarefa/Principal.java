package br.com.will.tarefa;

public class Principal {
    public static void main(String[]args){
        Cliente cliente = new Cliente("A",true);
        Fabrica fabrica = getFabrica(cliente);
        Carro carro = fabrica.create(cliente.getSolicitacaoDeNota());
        carro.ligarMotor();
    }

    private static Fabrica getFabrica(Cliente cliente) {
        if(cliente.temTemContratoDeEmpresa()){
            return new FabricaContratada();
        }else{
            return new FabricaSemContrato();
        }
    }
}
