package StrategyPattern;

public class ArcherAttacks implements Actions {
    public String archerA(){
        String output = "";
        output += "Archer aiming his enemy...\n";
        output += "Archer shoots an arrow!\n";
        return output;
    }

    @Override
    public String knightD() {
        return null;
    }

    @Override
    public String knightA() {
        return null;
    }

    @Override
    public String wizardA() {
        return null;
    }

    @Override
    public String archerD() {
        return null;
    }
}
