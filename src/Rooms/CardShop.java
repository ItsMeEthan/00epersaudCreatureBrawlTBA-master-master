package Rooms;

import Game.Runner;
import People.Person;

import java.util.Scanner;

public class CardShop extends Room {
    public CardShop(int x1, int y1) {
        super(x1,y1);

    }

    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {

            occupant = x;
            x.setxLoc(this.xLoc);
            x.setyLoc(this.yLoc);
            x.setxDeck(this.xDeck);
            x.getxGold(this.xGold);
            System.out.println("Grandpa: Welcome to the Card Shop! How can we assist you?");
            if (xDeck >= -1 & xDeck <= 1) {
                System.out.println("Grandpa: Oh is this your first time playing CreatureBrawl? Well lets teach you how to play.");
                System.out.println("Grandpa: You need to collect five creatures to help you on your journey.");
                System.out.println("Grandpa: You collect them by befriending them.");
                System.out.println("Grandpa: Here I will give you your first Creature. Their name is Ray");
                xDeck = 1;
                System.out.println("Congratulations you got Ray. Would you like to learn about Ray. (Y/N)");
                Scanner output= new Scanner(System.in);
                String s= output.nextLine();
                if(output.equals("Y")){
                    System.out.println("Ray: [Age:5/Type:Aqua-Thunder/Height:55cm/Weight:89lb]");
                    System.out.println("Where would you like to go? N/S/E/W");
                    if (output.equals("N")){
                        System.out.println("Where would you like to go? N/S/E/W");
                    }
                    else{
                        System.out.println("I am sorry that is not an acceptable answer.");
                    }
                }

        }

    }

}
