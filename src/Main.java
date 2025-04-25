public class Main {
    public static void main(String[] args) {

        System.out.println("Library reference");
        Author viktorPelevin = new Author("Viktor", "Pelevin");

        Book generationP = new Book("Generation P", viktorPelevin, 1999);
        System.out.println(generationP);

        Author gregoryRoberts = new Author("Gregory", "Roberts");
        Book shantaram = new Book("Shantaram", gregoryRoberts, 2003);
        shantaram.setPublicationYear(2010);
        System.out.println(shantaram);
    }
}