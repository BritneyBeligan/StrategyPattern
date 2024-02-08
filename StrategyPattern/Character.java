package StrategyPattern;

public class Character {

    private Actions actions;

    public Character(Actions actions){
        this.actions = actions;
    }

    public String knightA(){
       return actions.knightA();
    }

    public String wizardA(){
        return actions.wizardA();
    }

    public String archerD(){
        return actions.archerD();
    }

    public String archerA(){
        return actions.archerA();
    }

    public String knightD(){
        return actions.knightD();
    }

}
