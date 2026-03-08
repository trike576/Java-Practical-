class Student {

    private String regNo;
    private String name;
    private long contactNo;
    private String password;

    Student(String regNo, String name, long contactNo, String password){
        this.regNo = regNo;
        this.name = name;
        this.contactNo = contactNo;
        this.password = password;
    }

    public String getRegNo(){
        return regNo;
    }

    public String getName(){
        return name;
    }

    public long getContactNo(){
        return contactNo;
    }

    public String getPassword(){
        return password;
    }

    public void setContactNo(long contactNo){
        this.contactNo = contactNo;
    }

    public void display(){
        System.out.println(
            "Name: " + name +
            "\nRegistration Number: " + regNo +
            "\nContact Number: " + contactNo
        );
    }
}
