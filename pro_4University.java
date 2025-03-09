// Define a class University having instance variable uname, ucity and tot_stud.
// Define getUni() method to initialize instance variable. Define derived class
// Department having instance variable deptno and deptname. Define getDept()
// method to initialize instance variable. Also define display() method to display all
// information. Create two objects and demonstrate.

class pro_4University {
    protected String uname;
    protected String ucity;
    protected int tot_stud;

    // Method to initialize University instance variables
    public void getUni(String uname, String ucity, int tot_stud) {
        this.uname = uname;
        this.ucity = ucity;
        this.tot_stud = tot_stud;
    }
}

class Department extends pro_4University {
    private int deptno;
    private String deptname;

    // Method to initialize Department instance variables
    public void getDept(int deptno, String deptname) {
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
        // Creating and initializing first object
        Department dept1 = new Department();
        dept1.getUni("Atmiya University", "Rajkot", 25000);
        dept1.getDept(101, "Computer Science");

        // Creating and initializing second object
        Department dept2 = new Department();
        dept2.getUni("Marvadi University", "Rajkot", 30000);
        dept2.getDept(102, "Business Administration");

        // Displaying information
        dept1.display();
        dept2.display();
    }
}


