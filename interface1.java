public class interface1 {

    public static void main(String[] args) {
        Drawable circle = new Circle(5);
        Drawable rectangle = new Rectangle(8, 6);

        circle.draw(); // Calls the 'draw' method of the 'Circle' class
        rectangle.draw(); // Calls the 'draw' method of the 'Rectangle' class
    }
}

// Define an interface called 'Drawable'
interface Drawable {
    void draw(); // This method must be implemented by classes that implement the 'Drawable'
                 // interface.
}

// Implement the 'Drawable' interface in a class called 'Circle'
class Circle implements Drawable {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}

// Implement the 'Drawable' interface in a class called 'Rectangle'
class Rectangle implements Drawable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with width " + width + " and height " + height);
    }

}
