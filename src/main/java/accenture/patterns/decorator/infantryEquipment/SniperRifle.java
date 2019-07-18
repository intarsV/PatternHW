package accenture.patterns.decorator.infantryEquipment;

import accenture.patterns.abstractFactory.ArmyUnit;
import accenture.patterns.decorator.ArmyUnitDecorator;

public class SniperRifle extends ArmyUnitDecorator {

    public SniperRifle(ArmyUnit armyUnit) {
        this.armyUnit = armyUnit;
    }

    public String getDescription() {
        return armyUnit.getDescription() + "+Sniper rifle";
    }

    public double cost() {
        return 300 + armyUnit.cost();
    }
}
