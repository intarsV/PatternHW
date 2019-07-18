package accenture.patterns.abstractFactory.model;

import accenture.patterns.abstractFactory.ArmyUnit;

public class Drone extends ArmyUnit {

    public Drone() {
        description = "Raptor drone";
        unitType="Aircraft unit";
    }

    public double cost() {
        return 6000.0;
    }
}
