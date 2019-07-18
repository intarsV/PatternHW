package accenture.patterns;

import accenture.patterns.abstractFactory.ArmyUnit;
import accenture.patterns.abstractFactory.BaseArmyFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenerator {

    public static List<ArmyUnit> generateArmy(BaseArmyFactory factory) {
        int unitCount = 10;
        List<ArmyUnit> generatedArmy = new ArrayList<>();
        for (int i = 1; i <= unitCount; i++) {
            ArmyUnit unit = factory.createUnit(generateFactoryType(), generateArmyUnitConfig());
            generatedArmy.add(unit);
        }
        return generatedArmy;
    }

    private static String generateFactoryType() {
        String[] list = {"infantry", "vehicle", "aircraft"};
        Random r = new Random();
        int randomNumber = r.nextInt(list.length);
        return list[randomNumber];
    }

    private static Integer generateArmyUnitConfig() {
        String config;
        Random r = new Random();
        int randomNumberOne = r.nextInt(2) + 1;
        int randomNumberTwo = r.nextInt(2);
        String numberTwo = processNumberTwo(randomNumberTwo); //Need to get values{"", "1", "2"}
        config = String.valueOf(randomNumberOne) + numberTwo;
        return Integer.parseInt(config);
    }

    private static String processNumberTwo(int i) {
        if (i == 0) {
            return "";
        }
        return String.valueOf(i);
    }
}
