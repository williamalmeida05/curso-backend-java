package br.com.will.observer;

public class TV implements Observer{
    @Override
    public void update(Subject subject) {
        System.out.println("Recebendo a noticia da TV " + subject.toString());
    }
}
