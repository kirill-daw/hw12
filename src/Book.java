public class Book {
    private String nameBook;
    private Author authorBook;
    private int publicationYear;

    public Book(String nameBook, Author authorBook, int publicationYear) {
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.publicationYear = publicationYear;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthorBook() {
        return authorBook;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
