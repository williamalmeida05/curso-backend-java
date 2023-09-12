package br.com.will.factory;

public class SemContratosFactory extends Factory{
    @Override
    Car retriveCar(String requestedGrade) {
        if("A".equals(requestedGrade)){
            return new Brasilia(100,"cheio","azul");
        }else{
            return null;
        }
    }
}
