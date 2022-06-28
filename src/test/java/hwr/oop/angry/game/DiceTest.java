package hwr.oop.angry.game;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DiceTest {

    @Test
    void rollDice_numbersMatchSeed(){
        Dice dice = new Dice();
        for (int i=0; i < 20; i++){
            int u=dice.roll();
            assertThat(u).isEqualTo(2);
        }
    }

}
