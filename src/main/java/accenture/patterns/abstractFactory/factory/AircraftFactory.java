package accenture.patterns.abstractFactory.factory;

import accenture.patterns.abstractFactory.ArmyUnit;
import accenture.patterns.abstractFactory.BaseUnitFactory;
import accenture.patterns.abstractFactory.model.Drone;
import accenture.patterns.abstractFactory.model.F35;
import accenture.patterns.decorator.aircraftEquipment.Nuke;
import accenture.patterns.decorator.aircraftEquipment.Tomahawk;


public class AircraftFactory extends BaseUnitFactory {
    @Override
    public ArmyUnit createUnit(int type) {
        ArmyUnit armyUnit;
        switch (type) {
            case 1:
                armyUnit = new Drone();
                break;
            case 11:
                armyUnit = new Tomahawk(new Drone());
                break;
            case 12:
                armyUnit = new Nuke(new Drone());
                break;
            case 2:
                armyUnit = new F35();
                break;
            case 21:
                armyUnit = new Tomahawk(new F35());
                break;
            case 22:
                armyUnit = new Nuke(new F35());
                break;
            default:
                throw new IllegalArgumentException("No such armyUnit.");
        }
        return armyUnit;
    }
}
