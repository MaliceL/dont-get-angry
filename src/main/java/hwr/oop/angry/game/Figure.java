package hwr.oop.angry.game;

public class Figure {

    int position;
    int startpos;
    int houseentrance;
    int firsthouse;
    int teamid;

    public Figure(int startpos, int houseentrance, int firsthouse, int teamid) {
        this.position = 100;
        this.startpos = startpos;
        this.houseentrance = houseentrance;
        this.firsthouse = firsthouse;
        this.teamid = teamid;
    }

    public boolean isOnField() {
        if (this.position == 100) {
            return false;
        }
        return true;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void moveFigure(int dice) {
        if (this.position <= this.houseentrance && this.houseentrance < this.position + dice) {
            int stepsintohouse = this.houseentrance + 1 - this.position;
            this.position = dice - stepsintohouse + this.firsthouse;

        }
        else {
            if (this.position + dice > 40) {

                this.position = this.position + dice - 40;
            }
            else {
                this.position = this.position + dice;
            }
        }

    }

    public void putOnField() {
        this.position = this.startpos;
    }

    public void removeFromField() {
        this.position = 100;
    }

    public int getTeamId() { return this.teamid;}
}
