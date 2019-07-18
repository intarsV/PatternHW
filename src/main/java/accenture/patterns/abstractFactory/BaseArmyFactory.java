package accenture.patterns.abstractFactory;

public abstract class BaseArmyFactory {

    public abstract ArmyUnit createUnit(String type, int config);
}
