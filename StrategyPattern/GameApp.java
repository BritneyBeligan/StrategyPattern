package StrategyPattern;

public class GameApp {
    public static void main(String[] args) {

        Character act = new Character(new KnightAttacks());
        Character act1 = new Character(new WizardAttacks());
        Character act2 = new Character(new ArcherDefends());
        Character act3 = new Character(new ArcherAttacks());
        Character act4 = new Character(new KnightDefends());


        System.out.println("Game On!!!");

        System.out.println(act.knightA());
        System.out.println(act2.archerD());
        System.out.println(act1.wizardA());
        System.out.println(act3.archerA());
        System.out.println(act4.knightD());

        System.out.println("\nGame On, Victory Won \n Congratualtions!!!");
    }
}
