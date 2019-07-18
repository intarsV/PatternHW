package accenture.patterns.abstractFactory.factory;

import accenture.patterns.abstractFactory.ArmyUnit;
import accenture.patterns.abstractFactory.BaseUnitFactory;
import accenture.patterns.abstractFactory.model.Humvee;
import accenture.patterns.abstractFactory.model.Tank;
import accenture.patterns.decorator.vehicleEquipment.GroundAirMissiles;
import accenture.patterns.decorator.vehicleEquipment.Thermovisor;

public class VehicleFactory extends BaseUnitFactory {
    @Override
    public ArmyUnit createUnit(int type) {
        ArmyUnit armyUnit;
        switch (type) {
            case 1:
                armyUnit = new Humvee();
                break;
            case 11:
                armyUnit = new GroundAirMissiles(new Humvee());
                break;
            case 12:
                armyUnit = new Thermovisor(new Humvee());
                break;
            case 2:
                armyUnit = new Tank();
                break;
            case 21:
                armyUnit = new GroundAirMissiles(new Tank());
                break;
            case 22:
                armyUnit = new Thermovisor(new Tank());
                break;
            default:
                throw new IllegalArgumentException("No such armyUnit.");
        }
        return armyUnit;
    }
}
