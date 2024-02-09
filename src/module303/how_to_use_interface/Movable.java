package module303.how_to_use_interface;

public interface Movable {
    void moveUp();    // "public" and "abstract" by default
    void moveDown();
    void moveLeft();
    void moveRight();
    String getCoordinate();
}
