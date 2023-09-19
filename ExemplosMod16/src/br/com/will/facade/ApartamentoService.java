package br.com.will.facade;

public class ApartamentoService implements IApartamentoService{


    @Override
    public Boolean cadastrarApartamento(Apartamento apartamento) {
        Boolean isCadastrado = isApartamentoCadastrado(apartamento);
        Boolean isCamposValidados = isCamposValidos(apartamento);
        if(isCadastrado && !isCamposValidados){
            return false;
        }
        return cadastrarNoBanco(apartamento);
    }

    private Boolean cadastrarNoBanco(Apartamento apartamento) {
        //logica de cadastro

        return false;
    }

    private Boolean isCamposValidos(Apartamento apartamento) {
        return true;
    }

    private Boolean isApartamentoCadastrado(Apartamento apartamento) {
        //Ir no banco e verificar se está cadastrado
        return false;
    }
}
