package StrategyPattern;

public class KnightDefends implements Actions{

    public String knightD(){
        String output = "";
        output += "The fun has just begun! Knight will start defending his life!!\n";
        output += "Using a shield to defend!!\n";
        output += "Dodgin to avoid attack!!\n";
        output += "Creating a magic barrier for defense!\n";
        return output;
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

    @Override
    public String archerA() {
        return null;
    }


}
