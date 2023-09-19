package br.com.will.observer;

import java.util.ArrayList;
import java.util.List;

public class Jornalista implements Subject{

    public List<Observer> observers = new ArrayList<>();
    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }


    @Override
    public void notifyAll(String titulo) {
        for(Observer ob : this.observers){
            ob.update(this);
        }
    }

    @Override
    public String toString() {
        return "Jornalista{" +
                "observers=" + observers +
                '}';
    }
}

