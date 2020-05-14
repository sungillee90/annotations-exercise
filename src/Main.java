public class Main {
    public static void main(String[] args) {
        Author author = new Author("Sandi", "Metz");
        System.out.println("author.fullName() = " + author.fullName());
        author.addBook("Practical Object-Oriented Design in Ruby");
        author.addBook("99 Bottles of OOP");

        for (String book: author.publishedBooks()) {
            System.out.println(book);
        }
    }
}
