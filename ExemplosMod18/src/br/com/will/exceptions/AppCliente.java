package br.com.will.exceptions;

import javax.swing.*;

public class AppCliente {

    public static void main(String args[]) {
        String opcao = JOptionPane.showInputDialog(null,
                "Digite o código do cliente",
                "", JOptionPane.INFORMATION_MESSAGE);

        try {
            ClienteService.consutlarCliente(opcao);
        } catch (ClienteNaoEncontrato2Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Sair",JOptionPane.INFORMATION_MESSAGE);
        }

//        try {
//            ClienteService.consutlarCliente(opcao);
//        } catch(ClienteNaoEncontrato2Exception e) {
//            JOptionPane.showMessageDialog(null, e.getMessage(), "Sair",JOptionPane.INFORMATION_MESSAGE);
//        }

    }
}

//O ideal é tratar o erro na última camada, no caso desse projeto, será neste classe AppCliente.
