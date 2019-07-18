package accenture.patterns.observer;

import accenture.patterns.abstractFactory.ArmyUnit;

import java.util.List;

public class ObserverImpl extends Observer {

    public ObserverImpl(String observerName) {
        super(observerName);
    }

    @Override
    public void update(List<ArmyUnit> army) {
        if (!army.isEmpty()) {
            System.out.println("\n" + this.getName() + " got informed, that army created");
            printArmy(army);
        }
    }
}
