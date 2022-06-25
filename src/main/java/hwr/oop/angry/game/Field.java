package hwr.oop.angry.game;

public class Field {

    int position;
    Figure occupier;

    public Field(int position) {
        this.position = position;
    }

    public boolean isOccupied() {
        if (this.occupier == null) {
            return false;
        }
        return true;
    }

    public void setOccupier(Figure occupier) {
        this.occupier = occupier;
    }

    public void removeOccupier() { this.occupier = null; }

    public Figure getOccupier() { return this.occupier; }

    public int getPosition() { return this.position; }
}

