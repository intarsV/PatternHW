package accenture.patterns.abstractFactory;


import accenture.patterns.abstractFactory.factory.AircraftFactory;
import accenture.patterns.abstractFactory.factory.InfantryFactory;
import accenture.patterns.abstractFactory.factory.VehicleFactory;

public class ArmyFactory extends BaseArmyFactory {
    @Override
    public ArmyUnit createUnit(String type, int config) {
        ArmyUnit armyUnit;
        switch (type) {
            case "infantry":
                armyUnit = new InfantryFactory().createUnit(config);
                break;
            case "vehicle":
                armyUnit = new VehicleFactory().createUnit(config);
                break;
            case "aircraft":
                armyUnit = new AircraftFactory().createUnit(config);
                break;
            default:
                throw new IllegalArgumentException("No such armyUnit.");
        }
        return armyUnit;
    }
}
