package hwr.oop.angry.game;

public class Figure {

    int position;
    boolean onBoard;
    String name;
    String team;

    public Figure(int number, String team) {
        this.team = team;
        this.name = team.substring(0, 1) + number;
        this.markOffBoard();
    }

    public void markOnBoard() {
        this.onBoard = true;
    }

    public void markOffBoard() {
        this.onBoard = false;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void setOnStart() {
        switch (team) {
            case "blue":
                this.setPosition(1);
                break;
            case "red":
                this.setPosition(11);
                break;
            case "green":
                this.setPosition(21);
                break;
            case "yellow":
                this.setPosition(31);
                break;
        }
    }

    public void move() {

    }
}
