package accenture.patterns.observer;

import accenture.patterns.abstractFactory.ArmyUnit;

import java.util.List;

public interface Observable {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();

    public void updateArmyStatus(List<ArmyUnit> army);
}
