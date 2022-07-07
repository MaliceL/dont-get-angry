package hwr.oop.angry.game;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class AngryManualTest {

    private Dice dice;
    private GameBoard board;
    private Team teamblue;
    private Team teamred;
    private Team teamgreen;
    private Team teamyellow;

    @Test
    @Disabled("fullGame")
    void fullGame(){
        board = new GameBoard();
        dice = new Dice();
        teamblue = new Team(0 , 39, 40, 1);
        teamred = new Team(10, 9, 44, 2);
        teamgreen = new Team(20, 19, 48, 3);
        teamyellow = new Team(30 , 29, 52, 4);




    }
}
