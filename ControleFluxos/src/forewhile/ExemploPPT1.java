package forewhile;

import java.util.ArrayList;
import java.util.List;

public class ExemploPPT1 {
    public static void main(String args[]){

        //For utilizado como contador, o qual sabemos a quantiadade de registro que contém dentro.
        List<Integer> valores = new ArrayList<>();
        for (int i = 0; i <= 10; i++){
            System.out.println("Linha " + 1);
            valores.add(i);
        }

        // For que utiliza colecões, e não sabemos o que contém dentro.
        for (Integer i : valores){
            System.out.println("Linha " + i);
        }

        //For aprimorado com lambda.
        valores.forEach(i -> System.out.println("Linha " + i));

    }

}
