package hwr.oop.angry.game;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AngryTest {
    @Test
    void getPositionAtIndex30() {
        GameBoard board = new GameBoard();
        Field retrieve = board.list.get(30);
        assertThat(retrieve.getPosition()).isEqualTo(30);
    }

    @Test
    void createTeamBlueMoveFigureTwoFrom0To5() {
        Team teamblue = new Team(0,39, 40, 1);
        Figure BlueTwo = teamblue.list.get(1);
        BlueTwo.putOnField();
        BlueTwo.moveFigure(5);
        assertThat(BlueTwo.getPosition()).isEqualTo(5);
    }

    @Test
    void createTeamBlueRemoveFigureAndCheckOnField() {
        Team teamblue = new Team(0,39, 40, 1);
        Figure BlueTwo = teamblue.list.get(1);
        BlueTwo.setPosition(23);
        BlueTwo.removeFromField();
        assertThat(BlueTwo.isOnField()).isEqualTo(false);
    }

    @Test
    void createTeamRedMoveFigureOverField39Threshhold() {
        Team teamred = new Team(10,9, 44, 1);
        Figure RedThree = teamred.list.get(2);
        RedThree.setPosition(39);
        RedThree.moveFigure(3);
        assertThat(RedThree.getPosition()).isEqualTo(2);
    }

    @Test
    void createTeamBlueMoveFigureInHouse() {
        Team teamblue = new Team(0,39, 40, 1);
        Figure BlueTwo = teamblue.list.get(1);
        BlueTwo.setPosition(37);
        BlueTwo.moveFigure(6);
        assertThat(BlueTwo.getPosition()).isEqualTo(43);
        //System.out.println(BlueTwo.getPosition());
    }
}

