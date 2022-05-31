package hwr.oop.angry;

public class Field {

    boolean occupied;
    int position;
    String occupier;
    String fieldType;

    public Field(int position,String type) {
        this.position = position;
        this.fieldType = type;
    }

    public void getType(int position) {

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

    public void getOccupier() {

    }
}
