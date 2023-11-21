package tarefa;

/*
* Por em pratica o generics, pode ser uma lista
*
* criar classes de carros(honda,civic)
*
* a lista deve receber qualquer tipo de caro
*
* dica: rever classe abstrata e classe concreta, pense na lista utilizando a classe abstrata
*
*
* */

import cadastro.dao.ClienteMapDAO;
import cadastro.domain.Cliente;
import tarefa.dao.CarroMapDAO;
import tarefa.dao.ICarroDAO;
import tarefa.domain.Carro;

import javax.swing.*;

public class Main {

    private static ICarroDAO iCarroDAO;

    public static void main(String[] args){

        iCarroDAO = new CarroMapDAO();

        String opcao = JOptionPane.showInputDialog(null,
                "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair",
                "Green dinner", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)) {
                sair();
            }
            opcao = JOptionPane.showInputDialog(null,
                    "Opção inválida digite 1 para cadastro, 2 para consulta, 3 para exclusão, 4 para alteração ou 5 para sair",
                    "Green dinner", JOptionPane.INFORMATION_MESSAGE);
        }

        while (isOpcaoValida(opcao)) {

            if (isOpcaoSair(opcao)) {
                sair();
            }else if (isCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do carro separados por vígula, conforme exemplo: codChassi, marca, modelo",
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            } else if (isConsulta(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o chassi do carro",
                        "Consulta carro", JOptionPane.INFORMATION_MESSAGE);
                consultar(dados);
            } else if (isExclusao(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o chassi do carro",
                        "Consulta carro", JOptionPane.INFORMATION_MESSAGE);
                excluir(dados);
            } else {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do carro separados por vígula, conforme exemplo: codChassi, marca, modelo",
                        "Atualização", JOptionPane.INFORMATION_MESSAGE);
                atualizar(dados);
            }

            opcao = JOptionPane.showInputDialog(null,
                    "Digite 1 para cadastro, 2 para consulta, 3 para exclusão, 4 para alteração ou 5 para sair",
                    "Green dinner", JOptionPane.INFORMATION_MESSAGE);

        }

    }

    private static void atualizar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Carro carro = new Carro(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2]);
        iCarroDAO.alterar(carro);
    }

    private static void excluir(String dados) {
        iCarroDAO.excluir(Long.parseLong(dados));
        JOptionPane.showMessageDialog(null, "Carro excluído com sucesso: ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
    }


    private static void consultar(String dados) {
        Carro carro = iCarroDAO.consultar(Long.parseLong(dados));
        if (carro != null) {
            JOptionPane.showMessageDialog(null, "Carro encontrado com sucesso: " + carro.toString(), "Sucesso",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Carro não encontrado", "ERRO",JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Carro carro = new Carro(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2]);
        Boolean isCadastrado = iCarroDAO.cadastrar(carro);
        if (isCadastrado) {
            JOptionPane.showMessageDialog(null, "Carro cadastrado com sucesso ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Carro já se encontra cadastrado", "Erro",JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private static boolean isExclusao(String opcao) {
        if ("3".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isConsulta(String opcao) {
        if ("2".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isCadastro(String opcao) {
        if ("1".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void sair() {
        String clientesCadastrados = "";
        for (Carro carro : iCarroDAO.buscarTodos()) {
            clientesCadastrados += carro.toString() + "\n";
        }

        JOptionPane.showMessageDialog(null, "Carro cadastrados: " + clientesCadastrados, "Até logo",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOpcaoSair(String opcao) {
        if ("5".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isOpcaoValida(String opcao) {
        if ("1".equals(opcao) || "2".equals(opcao)
                || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)) {
            return true;
        }
        return false;

    }
}
