//program 6 Abstract class Shape
abstract class Shape {
    // Abstract method draw()
    abstract void draw();
}

// Rectangle class extends Shape and provides implementation for draw()
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Circle class extends Shape and provides implementation for draw()
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating references of Shape class
        Shape shape;

        // Creating an instance of Rectangle
        shape = new Rectangle();
        shape.draw();  // Outputs: Drawing a Rectangle

        // Creating an instance of Circle
        shape = new Circle();
        shape.draw();  // Outputs: Drawing a Circle
    }
}
