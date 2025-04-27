import java.util.Objects;

public class Book {
    private final String nameBook;
    private final Author authorBook;
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

    @Override
    public String toString() {
        return "The book: " + nameBook + "; Author: " + authorBook.toString() + "; Year of publication: " + publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(nameBook, book.nameBook) && Objects.equals(authorBook, book.authorBook);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nameBook, authorBook, publicationYear);
    }
}