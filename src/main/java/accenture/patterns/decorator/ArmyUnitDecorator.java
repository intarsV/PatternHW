package accenture.patterns.decorator;

import accenture.patterns.abstractFactory.ArmyUnit;

public abstract class ArmyUnitDecorator extends ArmyUnit {

    protected ArmyUnit armyUnit;

    public abstract String getDescription();

    public String getUnitType() {
        return armyUnit.getUnitType();
    }
}
