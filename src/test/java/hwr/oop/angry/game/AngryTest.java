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

    @Test
    void createRedBlueStrikeScenario() {
        GameBoard board = new GameBoard();
        Team teamred = new Team(10, 9, 44, 2);
        Team teamblue = new Team(0 , 39, 40, 1);
        Figure RedOne = teamred.list.get(0);
        Figure BlueOne = teamblue.list.get(0);
        RedOne.setPosition(15);
        board.list.get(15).setOccupier(RedOne);
        BlueOne.setPosition(10);
        board.list.get(10).setOccupier(BlueOne);
        int targetPos = BlueOne.getPosition() + 5;
        Field targetField = board.list.get(targetPos);
        if(targetField.isOccupied() == true) {
            Figure targetFigure = targetField.getOccupier();
            if(targetFigure.getTeamId() == BlueOne.getTeamId()){
                System.out.println("Friendly Figure on Target");
            }
            else {
                targetFigure.removeFromField();
                board.list.get(BlueOne.getPosition()).removeOccupier();
                BlueOne.moveFigure(5);
                board.list.get(BlueOne.getPosition()).setOccupier(BlueOne);
            }
        }
        assertThat(targetField.getOccupier()).isEqualTo(BlueOne);
    }
}

