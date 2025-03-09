class University {
    protected String uname;
    protected String ucity;
    protected int tot_stud;

    // Parameterized constructor to initialize University instance variables
    public University(String uname, String ucity, int tot_stud) {
        this.uname = uname;
        this.ucity = ucity;
        this.tot_stud = tot_stud;
    }
}

class Department extends University {
    private int deptno;
    private String deptname;

    // Parameterized constructor to initialize Department instance variables
    public Department(String uname, String ucity, int tot_stud, int deptno, String deptname) {
        super(uname, ucity, tot_stud);
        this.deptno = deptno;
        this.deptname = deptname;
    }

    // Method to display all information
    public void display() {
        System.out.println("University Name: " + uname);
        System.out.println("University City: " + ucity);
        System.out.println("Total Students: " + tot_stud);
        System.out.println("Department Number: " + deptno);
        System.out.println("Department Name: " + deptname);
    }

    public static void main(String[] args) {
        // Creating and initializing first object using parameterized constructor
        Department dept1 = new Department("Atmiya University", "Rajkot", 25000, 101, "Computer Science");

        // Creating and initializing second object using parameterized constructor
        Department dept2 = new Department("Marvadi University", "Rajkot", 30000, 102, "Business Administration");

        // Displaying information
        dept1.display();
        dept2.display();
    }
}
