package accenture.patterns.decorator.infantryEquipment;

import accenture.patterns.abstractFactory.ArmyUnit;
import accenture.patterns.decorator.ArmyUnitDecorator;

public class Mg50 extends ArmyUnitDecorator {

    public Mg50(ArmyUnit armyUnit) {
        this.armyUnit = armyUnit;
    }

    public String getDescription() {
        return armyUnit.getDescription() + "+MG-50";
    }

    public double cost() {
        return 200 + armyUnit.cost();
    }
}
