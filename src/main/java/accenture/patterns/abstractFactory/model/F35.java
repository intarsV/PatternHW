package accenture.patterns.abstractFactory.model;

import accenture.patterns.abstractFactory.ArmyUnit;

public class F35 extends ArmyUnit {

    public F35() {
        description = "F35 Stealth";
        unitType="Aircraft unit";
    }

    public double cost() {
        return 30000.0;
    }
}
