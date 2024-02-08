package StrategyPattern;

public class WizardAttacks implements Actions {

    public String wizardA(){
        String output = "";
        output += "Wizard forming his magic...\n";
        output += "Wizard casts a spell!\n";
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
    public String archerD() {
        return null;
    }

    @Override
    public String archerA() {
        return null;
    }
}
