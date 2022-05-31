package hwr.oop.angry;

public class Figure {

    int position;
    boolean onBoard;
    String name;
    String team;

    public Figure() {

    }

    public void markOnBoard() {
        this.onBoard = true;
    }

    public void markOffBoard() {
        this.onBoard = false;
    }

    public void move() {

    }
}
