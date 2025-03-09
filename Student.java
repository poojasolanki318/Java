class Student {
    private String name;
    private int age;
    private char gender;

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.gender = 'U';
    }

    // Constructor with name only
    public Student(String name) {
        this.name = name;
        this.age = 0;
        this.gender = 'U';
    }

    // Constructor with name and age
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = 'U';
    }

    // Constructor with all parameters
    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Method to display student details
    public void display() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Alice");
        Student s3 = new Student("Bob", 20);
        Student s4 = new Student("Charlie", 22, 'M');

        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
