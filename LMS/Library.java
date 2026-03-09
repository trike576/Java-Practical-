class Library {

    Book[] books;
    Student[] students;

    int bookCount = 0;
    int studentCount = 0;

    Library(int bookCapacity, int studentCapacity){
        books = new Book[bookCapacity];
        students = new Student[studentCapacity];
    }

    public void addBook(Book b){

        books[bookCount] = b;
        bookCount++;

        System.out.println("Book added successfully.");
    }

    public void addStudent(Student s){

        students[studentCount] = s;
        studentCount++;

        System.out.println("Student registered successfully.");
    }

    public void displayBooks(){

        for(int i=0;i<bookCount;i++){
            books[i].display();
            System.out.println();
        }
    }

    public void displayStudents(){

        for(int i=0;i<studentCount;i++){
            students[i].display();
            System.out.println();
        }
    }

    public Book getBookById(String id){

        for(int i=0;i<bookCount;i++){

            if(books[i].getBookId().equals(id))
                return books[i];
        }

        return null;
    }

    public Student getStudentById(String id){

        for(int i=0;i<studentCount;i++){

            if(students[i].getStudentId().equals(id))
                return students[i];
        }

        return null;
    }
}