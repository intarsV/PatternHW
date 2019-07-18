package accenture.patterns.decorator.vehicleEquipment;

import accenture.patterns.abstractFactory.ArmyUnit;
import accenture.patterns.decorator.ArmyUnitDecorator;

public class GroundAirMissiles extends ArmyUnitDecorator {

    public GroundAirMissiles(ArmyUnit armyUnit) {
        this.armyUnit = armyUnit;
    }

    public String getDescription() {
        return armyUnit.getDescription() + "+GroundAirMissiles";
    }

    public double cost() {
        return 700 + armyUnit.cost();
    }
}
