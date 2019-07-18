package accenture.patterns.observer;

import accenture.patterns.abstractFactory.ArmyUnit;

import java.util.List;

abstract class Observer {
    private String observerName;

    Observer(String observerName) {
        this.observerName = observerName;
    }

    abstract void update(List<ArmyUnit> army);

    void printArmy(List<ArmyUnit> army) {
        Double totalCost = 0.0;
        for (ArmyUnit armyUnit : army) {
            System.out.println(armyUnit.getUnitType() + " --- " + armyUnit.getDescription()
                    + " --- unit cost: " + armyUnit.cost());
            totalCost += armyUnit.cost();
        }
        System.out.println("Total army cost: " + totalCost);
    }

    String getName() {
        return observerName;
    }
}
