import java.util.Scanner;

class LMS {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Library lib = new Library(50,50);

        boolean running = true;

        while(running){

            System.out.println("""
            =========================
            LIBRARY MANAGEMENT SYSTEM
            =========================

            1. Add Book
            2. Register Student
            3. Display Books
            4. Display Students
            5. Search Book By Book Id
            6. Search Student By Student Id
            7. Exit
            """);

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){

                case 1:

                    System.out.print("Book ID: ");
                    String bookId = sc.nextLine();

                    System.out.print("Title: ");
                    String title = sc.nextLine();

                    System.out.print("Author: ");
                    String author = sc.nextLine();

                    System.out.print("Year: ");
                    int year = sc.nextInt();
                    sc.nextLine();

                    Book b = new Book(bookId,author,title,year);
                    lib.addBook(b);

                    break;

                case 2:

                    System.out.print("Student ID: ");
                    String studentId = sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Department: ");
                    String dept = sc.nextLine();

                    Student s = new Student(studentId,0,name,dept);

                    lib.addStudent(s);

                    break;

                case 3:
                    lib.displayBooks();
                    break;

                case 4:
                    lib.displayStudents();
                    break;

                case 5:

                    System.out.print("Enter Book ID: ");
                    String id = sc.nextLine();

                    Book book = lib.getBookById(id);

                    if(book!=null)
                        book.display();
                    else
                        System.out.println("Book not found");

                    break;

                case 6:

                    System.out.print("Enter Student ID: ");
                    String sid = sc.nextLine();

                    Student student = lib.getStudentById(sid);

                    if(student!=null)
                        student.display();
                    else
                        System.out.println("Student not found");

                    break;

                case 7:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}