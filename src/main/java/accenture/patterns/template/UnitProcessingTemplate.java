package accenture.patterns.template;

import accenture.patterns.abstractFactory.ArmyUnit;

public abstract class UnitProcessingTemplate {

    public final void processArmyUnit(ArmyUnit armyUnit) {
        doUnitTraining(armyUnit);
        makeAnOath();
    }

    /*This is individual for ArmyUnits type */
    abstract void doUnitTraining(ArmyUnit armyUnit);

    /*This is common for all ArmyUnits */
    private void makeAnOath() {
        // System.out.println("I swear to defend my country...");
    }
}
