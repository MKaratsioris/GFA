package models;

public class Hero {

    private int x;
    private int y;

    private Direction direction;

    public Hero(int x, int y) {
        this.x = x;
        this.y = y;
        direction = Direction.DOWN;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void moveUp() {
        y--;
        direction = Direction.UP;
    }

    public void moveDown() {
        y++;
        direction = Direction.DOWN;
    }

    public void moveLeft() {
        x--;
        direction = Direction.LEFT;
    }

    public void moveRight() {
        x++;
        direction = Direction.RIGHT;
    }
}
