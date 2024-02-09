package module303.how_to_use_interface;

public class Rectangle extends Shape {

    private int x;
    private int y;

    public Rectangle(){};
    public Rectangle(int x, int y, String color, double width, double height) {
        super.height = height;
        super.width = width;
        super.color = color;
        this.x = x;
        this.y = y;
    }

    @Override
    public double getArea() {
        return super.width * super.height;
    }

    @Override
    public void displayshapName() {
        System.out.println("I am a Rectangle");
    }
    /** Returns a self-descriptive string */
    @Override
    public String toString() {
        return "Rectangle[height=" + height + ",width=" + width + "," + super.toString() + "]";
    }

    public String getCoordinate()
    {
        return  "(" + x + "," + y + ")";
    }

    // Need to implement all the abstract methods defined in the interface Movable
    @Override
    public void moveUp() {
        y++;
    }
    @Override
    public void moveDown() {
        y--;
    }
    @Override
    public void moveLeft() {
        x--;
    }
    @Override
    public void moveRight() {
        x++;
    }
}
