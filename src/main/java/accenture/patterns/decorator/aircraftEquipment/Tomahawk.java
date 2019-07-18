package accenture.patterns.decorator.aircraftEquipment;

import accenture.patterns.abstractFactory.ArmyUnit;
import accenture.patterns.decorator.ArmyUnitDecorator;

public class Tomahawk extends ArmyUnitDecorator {

    public Tomahawk(ArmyUnit armyUnit) {
        this.armyUnit = armyUnit;
    }

    public String getDescription() {
        return armyUnit.getDescription() + "+Tomahawk missile";
    }

    public double cost() {
        return 6000 + armyUnit.cost();
    }
}
