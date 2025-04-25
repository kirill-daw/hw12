import java.util.Objects;

public class Author {
    private final String name;
    private final String surname;

    public Author(String nameAuthor, String surnameAuthor) {
        this.name = nameAuthor;
        this.surname = surnameAuthor;
    }

    public String getNameAuthor() {
        return name;
    }

    public String getSurnameAuthor() {
        return surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(surname, author.surname);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, surname);
    }
}
