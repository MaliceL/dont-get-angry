package hwr.oop.angry.game;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AngryTest {
    @Test
    void typeOfField32IsNormal() {
        GameBoard board = new GameBoard();
        Field number32 = board.getFieldAt(32);
        String type = number32.getType();
        assertThat(type).isEqualTo("normal");
    }

    @Test
    void typeOfField45IsHouse() {
        GameBoard board = new GameBoard();
        Field number45 = board.getFieldAt(45);
        String type = number45.getType();
        assertThat(type).isEqualTo("house");
    }
}

