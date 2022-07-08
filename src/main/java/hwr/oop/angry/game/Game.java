package hwr.oop.angry.game;

public class Game {

    private final GameBoard board;
    private final Dice dice;
    private final Team team;

    public Game(GameBoard board, Dice dice, Team team) {
        this.board = board;
        this.dice = dice;
        this.team = team;
    }

    public boolean figureOnField() {
        for (int i = 0; i < 4; i++) {
            if (team.list.get(i).getPosition() != 100) {
                return true;
            }
        }
        return false;
    }

    public void fullTurn() {
        if (!figureOnField()) {
            if (!dice.rollUntilSixMaxThree()) {
                return;
            }
            team.list.get(0).putOnField();
            team.list.get(0).moveFigure(5);
            board.list.get(team.list.get(0).getPosition()).setOccupier(team.list.get(0));
        }
    }
}
