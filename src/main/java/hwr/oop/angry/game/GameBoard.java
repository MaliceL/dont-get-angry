package hwr.oop.angry.game;

import java.util.ArrayList;
import java.util.List;

public class GameBoard {

    List<Field> list;

    public GameBoard() {
        this.list = new ArrayList<>();
        for (int i = 0; i < 56; i++) {
            Field field = new Field(i);
            this.list.add(field);
        }
    }
}
