package br.com.will.tarefa;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.text.Annotation;

public class ReflectionsClasses {
    public static void main(String args []) {
        executeLeituraAnotacao();
    }

    private static void executeLeituraAnotacao() {
//        System.out.println("*** Annotations ***");
        TabelaAnotacao tab = new TabelaAnotacao();

        for(Field field : tab.getClass().getDeclaredFields()){
            if(field.isAnnotationPresent(Anotacao.class)){
                Anotacao ano =  field.getAnnotation(Anotacao.class);
                System.out.println("Descrição da classe e anotação: " + ano.toString());
                System.out.println("Valor da anotação: " + ano.value());
            }
        }

    }

}



