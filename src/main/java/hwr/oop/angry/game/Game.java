package hwr.oop.angry.game;

public class Game {

    private GameBoard board;
    private Dice dice;
    private Team team;

    public Game(GameBoard board, Dice dice, Team team) {
        this.board = board;
        this.dice = dice;
        this.team = team;
    }

    public boolean figureOnField() {
        for (int i = 0; i < 4; i++) {
            if(team.list.get(i).getPosition() != 100) {
                return true;
            }
        }
        return false;
    }

    public void fullTurn() {
        if(!figureOnField()) {
            if (!dice.rollUntilSixMaxThree()) {
                return;
            }
            team.list.get(0).putOnField();
            team.list.get(0).moveFigure(5);
            board.list.get(team.list.get(0).getPosition()).setOccupier(team.list.get(0));
            return;
        }
    }

    //DELETE OR FIND SOLUTION
    public void putFigureOnGameboardIfNoneThere(boolean test){
        if(!figureOnField()) {
            if(!dice.rollUntilSixMaxThree()) {
                return;
            }
            if(test) {
                team.list.get(0).putOnField();
                team.list.get(0).moveFigure(5);
                board.list.get(team.list.get(0).getPosition()).setOccupier(team.list.get(0));
                return;
            }
            //TEST ENDE
            else {
                team.list.get(0).putOnField();
                int currentRoll = dice.roll();
                team.list.get(0).moveFigure(currentRoll);
                board.list.get(team.list.get(0).getPosition()).setOccupier(team.list.get(0));
                if(currentRoll == 6) {

                }
            }
            team.list.get(0).putOnField();
            team.list.get(0).moveFigure(dice.roll());
            board.list.get(team.list.get(0).getPosition()).setOccupier(team.list.get(0));
            return;
        }
    }



}
