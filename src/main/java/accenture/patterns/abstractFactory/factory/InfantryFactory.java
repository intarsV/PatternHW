package accenture.patterns.abstractFactory.factory;

import accenture.patterns.abstractFactory.ArmyUnit;
import accenture.patterns.abstractFactory.BaseUnitFactory;
import accenture.patterns.abstractFactory.model.SimpleSoldier;
import accenture.patterns.abstractFactory.model.SpecOps;
import accenture.patterns.decorator.infantryEquipment.Mg50;
import accenture.patterns.decorator.infantryEquipment.SniperRifle;

public class InfantryFactory extends BaseUnitFactory {
    @Override
    public ArmyUnit createUnit(int type) {
        ArmyUnit armyUnit;
        switch (type) {
            case 1:
                armyUnit = new SimpleSoldier();
                break;
            case 11:
                armyUnit = new SniperRifle(new SimpleSoldier());
                break;
            case 12:
                armyUnit = new Mg50(new SimpleSoldier());
                break;
            case 2:
                armyUnit = new SpecOps();
                break;
            case 21:
                armyUnit = new SniperRifle(new SpecOps());
                break;
            case 22:
                armyUnit = new Mg50(new SpecOps());
                break;
            default:
                throw new IllegalArgumentException("No such armyUnit.");
        }
        return armyUnit;
    }
}
