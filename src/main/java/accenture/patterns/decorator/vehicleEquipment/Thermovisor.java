package accenture.patterns.decorator.vehicleEquipment;

import accenture.patterns.abstractFactory.ArmyUnit;
import accenture.patterns.decorator.ArmyUnitDecorator;

public class Thermovisor extends ArmyUnitDecorator {

    public Thermovisor(ArmyUnit armyUnit) {
        this.armyUnit = armyUnit;
    }

    public String getDescription() {
        return armyUnit.getDescription() + "+Thermovisor";
    }

    public double cost() {
        return 500 + armyUnit.cost();
    }
}
