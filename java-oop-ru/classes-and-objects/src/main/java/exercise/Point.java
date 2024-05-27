package exercise;

import lombok.Getter;
import lombok.Setter;


// BEGIN

class Point {
    private int x;
    private int y;

    Point(int coordinateX, int coordinateY) {
        this.x = coordinateX;
        this.y = coordinateY;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
// END
