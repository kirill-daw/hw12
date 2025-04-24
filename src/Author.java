public class Author {
    private String name;
    private String surname;

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
}
