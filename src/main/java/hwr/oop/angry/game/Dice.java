package hwr.oop.angry.game;

import java.util.Random;

public class Dice {

    public int roll(){
        Random random = new Random(1337);
        return (random.nextInt(6)+1) ;
    }
}
