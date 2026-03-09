class Book {

    private String bookId;
    private String authorName;
    private String title;
    private int year;

    Book(String bookId, String authorName, String title, int year){
        this.bookId = bookId;
        this.authorName = authorName;
        this.title = title;
        this.year = year;
    }

    public String getBookId(){
        return bookId;
    }

    public String getAuthorName(){
        return authorName;
    }

    public void display(){
        System.out.println(
            "Book ID: " + bookId +
            "\nTitle: " + title +
            "\nAuthor: " + authorName +
            "\nYear: " + year
        );
    }
}