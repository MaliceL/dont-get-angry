package hwr.oop.angry.game;

import java.util.Random;

public class Dice {

    Integer seed;

    public Dice (Integer seed){
        this.seed = seed;
    }




    public int roll(){
        if (seed == null) {
            Random random = new Random();
            return (random.nextInt(6)+1) ;
        } else {
            Random random = new Random(seed);
            return (random.nextInt(6) + 1);
        }
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
