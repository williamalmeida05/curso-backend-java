package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ExemploArrayList {
    public static void main(String args[]){
        exemploListaSimples();
        exeploListaSimplesOrdemAscendente();
        exemploNumeros();
    }

    private static void exemploNumeros() {
        System.out.println("***** exemploNumeros *****");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(3);
        System.out.println(numeros);
    }

    private static void exemploListaSimples(){
        System.out.println("***** exemploListaSimples *****");
        List<String> lista = new ArrayList<String>();
        lista.add("João da Silva");
        lista.add("Antonio Souza");
        lista.add("Lúcia Ferreira");
        System.out.println(lista);
        System.out.println("");
    }

    private static void exeploListaSimplesOrdemAscendente(){
        System.out.println("**** exeploListaSimplesOrdemAscendente ****");
        List<String> lista = new ArrayList<>();
        lista.add("João da Silva");
        lista.add("Antonio Souza");
        lista.add("Lúcia Ferreira");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }

}
