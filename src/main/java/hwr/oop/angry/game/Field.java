package hwr.oop.angry.game;

public class Field {

    int position;
    boolean occupied;
    String occupier;
    String fieldType;

    public Field(int position,String type) {
        this.position = position;
        this.fieldType = type;
    }

    public void markOccupied() {
        this.occupied = true;
    }

    public void markNotOccupied() {
        this.occupied = false;
    }

    public void setOccupier(String occupier) {
        this.occupier = occupier;
    }

    public String getOccupier() { return this.occupier; }

    public String getType() { return this.fieldType; }
}

