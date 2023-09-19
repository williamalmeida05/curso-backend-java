package br.com.will.observer;

import com.sun.source.doctree.SinceTree;

public class Demo {
    public static void main(String[]args){
        Jornalista jor = new Jornalista();
        jor.add(new TV());
        jor.notifyAll("Teste");
    }
}
