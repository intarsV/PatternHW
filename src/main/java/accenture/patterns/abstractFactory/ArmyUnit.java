package accenture.patterns.abstractFactory;

public abstract class ArmyUnit {

    protected String description;

    protected String unitType;

    public String getDescription() {
        return description;
    }

    public String getUnitType() {
        return unitType;
    }

    public abstract double cost();
}
