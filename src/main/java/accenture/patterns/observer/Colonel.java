package accenture.patterns.observer;

import accenture.patterns.abstractFactory.ArmyUnit;

import java.util.ArrayList;
import java.util.List;

public class Colonel implements Observable {

    private ArrayList<Observer> observers = new ArrayList<>();
    private List<ArmyUnit> army = new ArrayList<>();

    public Colonel(List<ArmyUnit> army) {
        this.army = army;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer ob : observers) {
            ob.update(army);
        }
    }

    @Override
    public void updateArmyStatus(List<ArmyUnit> army) {
        this.army = army;
        notifyObservers();
    }
}
