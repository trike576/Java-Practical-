class Management {

    String name;
    Student[] studentsList;
    int intakeCapacity;
    int noOfAdmittedStudents = 0;

    Management(String name, int intakeCapacity){
        this.name = name;
        this.intakeCapacity = intakeCapacity;
        studentsList = new Student[intakeCapacity];
    }


    // Admit new student
    public void admitStudent(Student newStudent){

        if(noOfAdmittedStudents == intakeCapacity){
            System.out.println("No more seats available.");
            return;
        }

        studentsList[noOfAdmittedStudents] = newStudent;
        noOfAdmittedStudents++;

        System.out.println("Student admitted successfully.");
    }


    // Display all students
    public void displayAllStudents(){

        if(noOfAdmittedStudents == 0){
            System.out.println("No students admitted.");
            return;
        }

        for(int i = 0; i < noOfAdmittedStudents; i++){
            studentsList[i].display();
            System.out.println();
        }
    }


    // Search student by name
    public Student getStudentByName(String name){

        for(int i = 0; i < noOfAdmittedStudents; i++){

            if(studentsList[i].getName().equals(name)){
                return studentsList[i];
            }
        }

        return null;
    }


    // Search student by registration number
    public Student getStudentByRegNo(String regNo){

        for(int i = 0; i < noOfAdmittedStudents; i++){

            if(studentsList[i].getRegNo().equals(regNo)){
                return studentsList[i];
            }
        }

        return null;
    }


    // Search student by contact number
    public Student getStudentByContactNo(long contactNo){

        for(int i = 0; i < noOfAdmittedStudents; i++){

            if(studentsList[i].getContactNo() == contactNo){
                return studentsList[i];
            }
        }

        return null;
    }


    // Update contact number
    public void updateStudentContactNo(String regNo, long newContactNo){

        Student s = getStudentByRegNo(regNo);

        if(s != null){
            s.setContactNo(newContactNo);
            System.out.println("Contact updated.");
        }
        else{
            System.out.println("Student not found.");
        }
    }


    // Delete student
    public void deleteStudent(String regNo){

        for(int i = 0; i < noOfAdmittedStudents; i++){

            if(studentsList[i].getRegNo().equals(regNo)){

                for(int j = i; j < noOfAdmittedStudents - 1; j++){
                    studentsList[j] = studentsList[j + 1];
                }

                studentsList[noOfAdmittedStudents - 1] = null;
                noOfAdmittedStudents--;

                System.out.println("Student deleted.");
                return;
            }
        }

        System.out.println("Student not found.");
    }
}