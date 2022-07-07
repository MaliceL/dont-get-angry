package hwr.oop.angry.game;

import java.util.Random;

public class Dice {

    public int roll(){
        Random random = new Random(187); //seed required for tests, remove for play
        return (random.nextInt(6)+1) ;
    }

    public boolean rollUntilSixMaxThree(){
        for (int i = 0; i < 3; i++) {
            if (roll() == 6){
                return true;
            }
        }
        return false;

    }
}
