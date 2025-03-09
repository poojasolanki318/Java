// Write a Java program which creates the Triangle class with two attributes base and
// height of type float or double. Takes the two constructors of the Triangle class.
// First constructor takes the default value for base and height and Second Constructor
// takes base and height as a parameter. Create a method calcArea() to calculate the
// area of the Triangle. Define a main method and create objects to the class and print
// the area of the Triangle.
   
class Triangle{
    private double base;
    private double height;

 
 // Default constructor with default values
    public Triangle() {
        this.base = 1.0;
        this.height = 1.0;
    }

    // Parameterized constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calcArea() {
        return 0.5 * base * height;
    }   

     public static void main(String[] args) {
        // Creating objects of Triangle class
        Triangle triangle1 = new Triangle(); // Default constructor
        Triangle triangle2 = new Triangle(5.0, 10.0); // Parameterized constructor

        // Printing the area of the triangles
        System.out.println("Area of triangle1: " + triangle1.calcArea());
        System.out.println("Area of triangle2: " + triangle2.calcArea());
    }
}    