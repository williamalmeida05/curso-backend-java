package generic;

import generic.fruta.Banana;
import generic.fruta.Fruta;
import generic.fruta.Maca;

import java.util.ArrayList;
import java.util.List;

public class ExemplosJavaGenerics {
    public static void main(String args[]){
        List<String> lista = new ArrayList();
        lista.add("Will");
        lista.add("1");
        imprimir(lista);

        List<Long> listaLong = new ArrayList();
        listaLong.add(1l);
        listaLong.add(2l);
        imprimir(listaLong);

        String primeiroSt = pegarPrimeiroLista(lista);
        System.out.println(primeiroSt);


        Long primeiroLong = pegarPrimeiroLista(listaLong);
        System.out.println(primeiroLong);

        Long primeiroLong2 = pegarPrimeiroListaLong(listaLong);
        System.out.println(primeiroLong2);

        imprimir2(listaLong);

        List<Fruta> frutas = new ArrayList<>();
        frutas.add(new Maca());
        frutas.add(new Banana());
        imprimirFrutas(frutas);

    }

    public static void imprimirFrutas(List<? extends Fruta> lista) {
        for (Fruta fruta : lista) {
            System.out.println(fruta);
        }
    }

    public static void imprimir2(List<?> lista) {
        for (Object st : lista) {
            if (st instanceof Long) {
                Long stLong = (Long) st;
                System.out.println(stLong);
            }
            System.out.println("Qualquer coisa: " + st);
        }
    }


    private static <T> Long pegarPrimeiroListaLong(List<T> lista) {
        return (Long) lista.get(0);
    }


    private static <T> void imprimir(List<T> lista) {
        for(T st : lista){
            System.out.println(st);
        }
    }

    public static <T> T pegarPrimeiroLista(List<T> lista) {
        return lista.get(0);
    }

}
