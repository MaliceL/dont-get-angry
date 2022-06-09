package hwr.oop.angry.game;

public class Field {

    int position;
    Field occupier;
    //String fieldType;

    public Field(int position) {
        this.position = position;
        //this.fieldType = type;
    }

    public boolean isOccupied() {
        if (this.occupier == null) {
            return false;
        }
        return true;
    }

    public void setOccupier(Field occupier) {
        this.occupier = occupier;
    }

    public Field getOccupier() { return this.occupier; }

    public int getPosition() { return this.position; }

    //public String getType() { return this.fieldType; }
}

