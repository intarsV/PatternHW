package accenture.patterns.facade;

import accenture.patterns.RandomGenerator;
import accenture.patterns.abstractFactory.ArmyFactory;
import accenture.patterns.abstractFactory.ArmyUnit;
import accenture.patterns.abstractFactory.BaseArmyFactory;
import accenture.patterns.observer.Colonel;
import accenture.patterns.observer.ObserverImpl;
import accenture.patterns.template.AircraftTemplate;
import accenture.patterns.template.InfantryTemplate;
import accenture.patterns.template.VehicleTemplate;

import java.util.ArrayList;
import java.util.List;

public class ArmyFacade {

    public void runProgram() {
        /*Define abstract factory for ArmyUnit creation--AbstractFactory+Decorator patterns*/
        BaseArmyFactory factory = new ArmyFactory();

        /*Initial army list empty*/
        List<ArmyUnit> army = new ArrayList<>();

        /*Define who to whom will report if order done--Observer pattern*/
        Colonel colonel = new Colonel(army);
        ObserverImpl general = new ObserverImpl("General");
        ObserverImpl president = new ObserverImpl("President");
        colonel.registerObserver(president);
        colonel.registerObserver(general);

        /*Generate new random army*/
        List<ArmyUnit> newArmy = RandomGenerator.generateArmy(factory);

        /*Do army training(if necessary->uncomment implementation)--Template pattern*/
        for (ArmyUnit armyUnit : army) {
            String unitType = armyUnit.getUnitType();
            switch (unitType) {
                case "Infantry unit":
                    new InfantryTemplate().processArmyUnit(armyUnit);
                    break;
                case "Vehicle unit":
                    new VehicleTemplate().processArmyUnit(armyUnit);
                    break;
                case "Aircraft unit":
                    new AircraftTemplate().processArmyUnit(armyUnit);
                    break;
            }
        }

        /*Observer pattern in action--President&General get informed*/
        colonel.updateArmyStatus(newArmy);
    }
}

