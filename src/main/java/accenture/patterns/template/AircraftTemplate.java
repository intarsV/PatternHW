package accenture.patterns.template;

import accenture.patterns.abstractFactory.ArmyUnit;

public class AircraftTemplate extends UnitProcessingTemplate {

    @Override
    void doUnitTraining(ArmyUnit armyUnit) {
        /* Do some aircraft training*/
        // System.out.println("Aircraft training - many hours PC games...");
    }
}
