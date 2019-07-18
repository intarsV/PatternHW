package accenture.patterns.template;

import accenture.patterns.abstractFactory.ArmyUnit;

public class InfantryTemplate extends UnitProcessingTemplate {

    @Override
    void doUnitTraining(ArmyUnit armyUnit) {
        /* Do some infantry training*/
        //System.out.println("Infantry training in jungles");
    }

}
