package accenture.patterns;


import accenture.patterns.facade.ArmyFacade;

public class LaunchProgram {

    public static void main(String[] args) {
        ArmyFacade facade = new ArmyFacade();
        facade.runProgram();
    }
}
