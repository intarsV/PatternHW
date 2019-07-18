package accenture.patterns.abstractFactory.model;

import accenture.patterns.abstractFactory.ArmyUnit;

public class SimpleSoldier extends ArmyUnit {

    public SimpleSoldier() {
        description = "SimpleSoldier";
        unitType="Infantry unit";
    }

    public double cost() {
        return 100.0;
    }
}
