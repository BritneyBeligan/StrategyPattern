package StrategyPattern;

public class ArcherDefends implements Actions{

    public String archerD(){
        String output = "";
        output += "Oh no Archer Got Hit!!!\n";
        output += "Archer using shield to defend!\n";
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
    public String archerA() {
        return null;
    }
}
