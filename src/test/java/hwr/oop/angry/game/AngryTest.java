package hwr.oop.angry.game;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AngryTest {
    @Test
    void typeOfField32IsNormal() {
        GameBoard board = new GameBoard();
        Field number32 = board.getFieldAt(32);
        int type = number32.getPosition();
        assertThat(type).isEqualTo(32);
    }

    @Test
    void typeOfField45IsHouse() {
        GameBoard board = new GameBoard();
        Field number45 = board.getFieldAt(45);
        int type = number45.getPosition();
        assertThat(type).isEqualTo(45);
    }
}

