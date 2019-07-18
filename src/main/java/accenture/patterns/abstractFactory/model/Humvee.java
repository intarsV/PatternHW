package accenture.patterns.abstractFactory.model;

import accenture.patterns.abstractFactory.ArmyUnit;

public class Humvee extends ArmyUnit {

    public Humvee() {
        description = "Humvee";
        unitType="Vehicle unit";
    }

    public double cost() {
        return 400.0;
    }
}
