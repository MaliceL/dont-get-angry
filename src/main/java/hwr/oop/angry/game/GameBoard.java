package hwr.oop.angry.game;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GameBoard {

    List board;

    public GameBoard() {
        /*
        board = new Field[56];
        for (int i = 0; i < 40; i++) {
            board[i] = new Field(i,"normal");
        }
        for (int i = 40; i <= board.length; i++) {
            board[i] = new Field(i,"house");
        }
         */
        List<Field> board = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            Field field = new Field(i);
            board.add(field);
        }

    }

    public void createFigures() {

    }

    public void fullHouseWin() {

    }

    public Field getFieldAt(int number) {
        Field field = board.get(number);
        return field;
    }
}
