package accenture.patterns.abstractFactory.model;

import accenture.patterns.abstractFactory.ArmyUnit;

public class SpecOps extends ArmyUnit {

    public SpecOps() {
        description = "SpecOps";
        unitType="Infantry unit";
    }

    public double cost() {
        return 200.0;
    }
}
