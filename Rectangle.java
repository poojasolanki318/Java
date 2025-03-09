
    class Rectangle {
        private double length;
        private double width;
    
        // Method to set values of length and width
        public void setValue(double length, double width) {
            this.length = length;
            this.width = width;
        }
    
        // Method to calculate area
        public double area() {
            return length * width;
        }
    
        public static void main(String[] args) {
            Rectangle rect = new Rectangle();
            rect.setValue(5.0, 3.0); // Setting length and width
            System.out.println("Area of Rectangle: " + rect.area()); // Displaying area
        }
    }
    
    

    
