package br.com.will.exceptions;

public class ClienteNaoEncontradoException extends Exception {

    public ClienteNaoEncontradoException(String msg) {
        super(msg);
    }
}