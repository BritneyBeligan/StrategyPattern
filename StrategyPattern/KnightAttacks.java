package StrategyPattern;

public class KnightAttacks implements Actions {

    public String knightA(){
        String output = "";
        output += "Knight will start attacking...  \n";
        output += "Knight attacks with a sword! \n";
        return output;
    }

    @Override
    public String knightD() {
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

    @Override
    public String archerA() {
        return null;
    }
}
