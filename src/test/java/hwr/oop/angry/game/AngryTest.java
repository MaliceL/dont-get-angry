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

    @Test
    void teamgreenWins() {
        GameBoard board = new GameBoard();
        Team teamgreen = new Team(20,19,48,3);
        board.list.get(48).setOccupier(teamgreen.list.get(0));
        board.list.get(49).setOccupier(teamgreen.list.get(1));
        board.list.get(50).setOccupier(teamgreen.list.get(2));
        board.list.get(51).setOccupier(teamgreen.list.get(3));
        assertThat(board.isGameOver()).isEqualTo(true);
    }

    @Test
    void teamblueWins() {
        GameBoard board = new GameBoard();
        Team teamblue = new Team(0 , 39, 40, 1);
        board.list.get(40).setOccupier(teamblue.list.get(0));
        board.list.get(41).setOccupier(teamblue.list.get(1));
        board.list.get(42).setOccupier(teamblue.list.get(2));
        board.list.get(43).setOccupier(teamblue.list.get(3));
        assertThat(board.isGameOver()).isEqualTo(true);
    }

    @Test
    void teamredWins() {
        GameBoard board = new GameBoard();
        Team teamred = new Team(0 , 39, 40, 1);
        board.list.get(44).setOccupier(teamred.list.get(0));
        board.list.get(45).setOccupier(teamred.list.get(1));
        board.list.get(46).setOccupier(teamred.list.get(2));
        board.list.get(47).setOccupier(teamred.list.get(3));
        assertThat(board.isGameOver()).isEqualTo(true);
    }

    @Test
    void teamyellowWins() {
        GameBoard board = new GameBoard();
        Team teamyellow = new Team(30 , 29, 52, 4);
        board.list.get(52).setOccupier(teamyellow.list.get(0));
        board.list.get(53).setOccupier(teamyellow.list.get(1));
        board.list.get(54).setOccupier(teamyellow.list.get(2));
        board.list.get(55).setOccupier(teamyellow.list.get(3));
        assertThat(board.isGameOver()).isEqualTo(true);
    }

    @Test
    void teamredFullTurn() {
        GameBoard board = new GameBoard();
        Team teamred = new Team(10, 9, 44, 2);
        Dice dice = new Dice(187);
        Game game = new Game(board, dice, teamred);
        game.fullTurn();
        assertThat(teamred.list.get(0).getPosition()).isEqualTo(15);
    }

    @Test
    void nobodyWins() {
        GameBoard board = new GameBoard();
        Team teamyellow = new Team(30 , 29, 52, 4);
        board.list.get(52).setOccupier(teamyellow.list.get(0));
        board.list.get(53).setOccupier(teamyellow.list.get(1));
        board.list.get(54).setOccupier(teamyellow.list.get(2));
        board.list.get(10).setOccupier(teamyellow.list.get(3));
        assertThat(board.isGameOver()).isEqualTo(false);
    }

    @Test
    void figureOnField_figureIsOnField() {
        GameBoard board = new GameBoard();
        Team teamyellow = new Team(30, 29, 52, 4);
        Dice dice = new Dice(null);
        Game game = new Game(board, dice, teamyellow);
        teamyellow.list.get(0).setPosition(10);
        assertThat(game.figureOnField()).isEqualTo(true);
    }

    @Test
    void roll_numbersMatchSeed(){
        Dice dice = new Dice(187);
        for (int i=0; i < 20; i++){
            int u=dice.roll();
            assertThat(u).isEqualTo(6);
        }
    }

    @Test
    void roll_randomNumbersAreBetween1And6(){
        Dice dice = new Dice(null);
        for (int i=0; i < 10; i++){
            int u=dice.roll();
            assertThat(u).isBetween(1,6);
        }
    }

    @Test
    void rollUntilSixMaxThree_returnsTrue() {
        Dice dice = new Dice(187);
        assertThat(dice.rollUntilSixMaxThree()).isEqualTo(true);
    }

    @Test
    void rollUntilSixMaxThree_returnsFalse() {
        Dice dice = new Dice(1337);
        assertThat(dice.rollUntilSixMaxThree()).isEqualTo(false);
    }
}




