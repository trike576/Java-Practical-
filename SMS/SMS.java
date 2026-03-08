import java.util.Scanner;

class SMS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("""
        ========================================
        Welcome To Student Management System
        ========================================
        Enter manager name: """);

        String managerName = sc.nextLine();

        System.out.print("Create manager password: ");
        String managerPassword = sc.nextLine();

        System.out.print("\nEnter intake capacity: ");
        int intakeCapacity = sc.nextInt();
        sc.nextLine();

        Management manager = new Management(managerName, intakeCapacity);

        while(true){

            displayMainMenu();
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){

                // ================= ADMIN LOGIN =================
                case 1:

                    if(managerLogin(sc, managerName, managerPassword)){
                        managerPanel(sc, manager);
                    }

                    break;


                // ================= STUDENT LOGIN =================
                case 2:

                    studentLogin(sc, manager);
                    break;


                case 3:
                    System.out.println("Exiting program...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // ================= MANAGER LOGIN =================

    public static boolean managerLogin(Scanner sc, String managerName, String managerPassword){

        for(int attempts = 1; attempts <= 3; attempts++){

            System.out.print("Enter manager name: ");
            String name = sc.nextLine();

            System.out.print("Enter password: ");
            String pass = sc.nextLine();

            if(name.equals(managerName) && pass.equals(managerPassword)){
                System.out.println("Login successful.");
                return true;
            }

            System.out.println("Invalid credentials. Attempt " + attempts + "/3");
        }

        System.out.println("Too many failed attempts.");
        return false;
    }


    // ================= MANAGER PANEL =================

    public static void managerPanel(Scanner sc, Management manager){

        boolean running = true;

        while(running){

            displayManagerMenu();

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){

                case 1:

                    System.out.print("Student name: ");
                    String name = sc.nextLine();

                    System.out.print("Registration number: ");
                    String regNo = sc.nextLine();

                    System.out.print("Contact number: ");
                    long contact = sc.nextLong();
                    sc.nextLine();

                    System.out.print("Create student password: ");
                    String password = sc.nextLine();

                    Student s = new Student(regNo, name, contact, password);
                    manager.admitStudent(s);

                    break;

                case 2:
                    manager.displayAllStudents();
                    break;

                case 3:

                    System.out.print("Enter registration number: ");
                    String reg = sc.nextLine();

                    Student st = manager.getStudentByRegNo(reg);

                    if(st != null)
                        st.display();
                    else
                        System.out.println("Student not found");

                    break;

                case 4:

                    System.out.print("Enter contact number: ");
                    long contactNo = sc.nextLong();
                    sc.nextLine();

                    Student s1 = manager.getStudentByContactNo(contactNo);

                    if(s1 != null)
                        s1.display();
                    else
                        System.out.println("Student not found");

                    break;

                case 5:

                    System.out.print("Enter name: ");
                    String n = sc.nextLine();

                    Student s2 = manager.getStudentByName(n);

                    if(s2 != null)
                        s2.display();
                    else
                        System.out.println("Student not found");

                    break;

                case 6:

                    System.out.print("Enter registration number: ");
                    String updateReg = sc.nextLine();

                    Student u = manager.getStudentByRegNo(updateReg);

                    if(u != null){

                        System.out.print("Enter new contact number: ");
                        long newContact = sc.nextLong();
                        sc.nextLine();

                        u.setContactNo(newContact);
                        System.out.println("Contact updated.");
                    }

                    break;

                case 7:

                    System.out.print("Enter registration number: ");
                    String del = sc.nextLine();

                    manager.deleteStudent(del);
                    break;

                case 8:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }


    // ================= STUDENT LOGIN =================

    public static void studentLogin(Scanner sc, Management manager){

        System.out.print("Enter registration number: ");
        String regNo = sc.nextLine();

        Student student = manager.getStudentByRegNo(regNo);

        if(student == null){
            System.out.println("Student not found.");
            return;
        }

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        if(!student.getPassword().equals(pass)){
            System.out.println("Wrong password.");
            return;
        }

        System.out.println("Login successful.");

        boolean running = true;

        while(running){

            displayStudentMenu();

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){

                case 1:
                    System.out.println(student.getRegNo());
                    break;

                case 2:
                    System.out.println(student.getContactNo());
                    break;

                case 3:
                    System.out.println(student.getName());
                    break;

                case 4:

                    System.out.print("Enter new contact number: ");
                    long contact = sc.nextLong();
                    sc.nextLine();

                    student.setContactNo(contact);
                    System.out.println("Contact updated.");

                    break;

                case 5:
                    student.display();
                    break;

                case 6:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }


    // ================= MENUS =================

    public static void displayMainMenu(){

        System.out.print("""
        =====================================
              STUDENT MANAGEMENT SYSTEM
        =====================================

        1. Admin Login
        2. Student Login
        3. Exit

        Enter choice: """);
    }


    public static void displayManagerMenu(){

        System.out.print("""
        ----------- MANAGER MENU -----------

        1. Admit Student
        2. Display All Students
        3. Get Student By Registration Number
        4. Get Student By Contact Number
        5. Get Student By Name
        6. Update Student Contact
        7. Delete Student
        8. Logout

        Enter choice: """);
    }


    public static void displayStudentMenu(){

        System.out.print("""
        ----------- STUDENT MENU -----------

        1. Get my Registration Number
        2. Get my Contact Number
        3. Get my Name
        4. Update Contact Number
        5. Display my information
        6. Logout

        Enter choice: """);
    }
}