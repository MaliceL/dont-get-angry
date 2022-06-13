package hwr.oop.angry.game;

import java.util.ArrayList;
import java.util.List;

public class Team {

    List<Figure> list;
    int teamid;
    Figure one;
    Figure two;
    Figure three;
    Figure four;

    public Team(int startpos, int houseentrance, int firsthouse, int teamid) {
        this.teamid = teamid;
        this.list = new ArrayList<>();
        this.one = new Figure(startpos, houseentrance, firsthouse, teamid);
        this.two = new Figure(startpos, houseentrance, firsthouse, teamid);
        this.three = new Figure(startpos, houseentrance, firsthouse, teamid);
        this.four = new Figure(startpos, houseentrance, firsthouse, teamid);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
    }
}
