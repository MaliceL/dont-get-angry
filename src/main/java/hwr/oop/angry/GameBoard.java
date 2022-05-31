package hwr.oop.angry;

public class GameBoard {

    Field Board[];

    public GameBoard() {
        Board = new Field[40];
        for (int i = 1; i <= 40; i++) {
            Board[i] = new Field(i,"normal");
        }
        for (int i = 41; i <= 56; i++) {
            Board[i] = new Field(i,"house");
        }
    }

    public void createFigures() {

    }

    public void fullHouseWin() {

    }

    public Field getFieldAt(int number) {
        Field field = Board[number];
        return field;
    }
}
