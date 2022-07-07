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

    public boolean isGameOver() {
        if(this.list.get(40).isOccupied() && this.list.get(41).isOccupied() && this.list.get(42).isOccupied() && this.list.get(43).isOccupied()) {
            System.out.println("Blue wins");
            return true;
        }
        else if(this.list.get(44).isOccupied() && this.list.get(45).isOccupied() && this.list.get(46).isOccupied() && this.list.get(47).isOccupied()) {
            System.out.println("Red wins");
            return true;
        }
        else if(this.list.get(48).isOccupied() && this.list.get(49).isOccupied() && this.list.get(50).isOccupied() && this.list.get(51).isOccupied()) {
            System.out.println("Green wins");
            return true;
        }
        else if(this.list.get(52).isOccupied() && this.list.get(53).isOccupied() && this.list.get(54).isOccupied() && this.list.get(55).isOccupied()) {
            System.out.println("Yellow wins");
            return true;
        }
        return false;
    }
}
