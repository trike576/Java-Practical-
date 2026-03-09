class Student {

    private String studentId;
    private int numberOfBooks;
    private String studentName;
    private String department;

    Student(String studentId, int numberOfBooks, String studentName, String department){
        this.studentId = studentId;
        this.numberOfBooks = numberOfBooks;
        this.studentName = studentName;
        this.department = department;
    }

    public String getStudentId(){
        return studentId;
    }

    public int getNumberOfBooks(){
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks){
        this.numberOfBooks = numberOfBooks;
    }

    public String getStudentName(){
        return studentName;
    }

    public void display(){
        System.out.println(
            "Student ID: " + studentId +
            "\nName: " + studentName +
            "\nDepartment: " + department +
            "\nBooks Issued: " + numberOfBooks
        );
    }
}
