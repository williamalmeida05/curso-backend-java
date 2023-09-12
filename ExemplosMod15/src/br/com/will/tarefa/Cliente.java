package br.com.will.tarefa;

public class Cliente {

    private String solicitacaoDeNota;
    private boolean temContratoDeEmpresa;

    public Cliente(String solicitacaoDeNota, Boolean temContratoDeEmpresa) {
        this.solicitacaoDeNota = solicitacaoDeNota;
        this.temContratoDeEmpresa = temContratoDeEmpresa;
    }

    public boolean temTemContratoDeEmpresa(){
        return temContratoDeEmpresa;
    }

    public String getSolicitacaoDeNota(){
        return solicitacaoDeNota;
    }

}
