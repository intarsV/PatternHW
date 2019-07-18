package accenture.patterns.decorator.aircraftEquipment;

import accenture.patterns.abstractFactory.ArmyUnit;
import accenture.patterns.decorator.ArmyUnitDecorator;

public class Nuke extends ArmyUnitDecorator {

    public Nuke(ArmyUnit armyUnit) {
        this.armyUnit = armyUnit;
    }

    public String getDescription() {
        return armyUnit.getDescription() + "+Nuke";
    }

    public double cost() {
        return 50000 + armyUnit.cost();
    }
}
