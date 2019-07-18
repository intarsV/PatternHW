package accenture.patterns.abstractFactory.model;

import accenture.patterns.abstractFactory.ArmyUnit;

public class Tank extends ArmyUnit {

    public Tank() {
        description = "Tank";
        unitType="Vehicle unit";
    }

    public double cost() {
        return 1000.0;
    }
}
