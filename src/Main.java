public class Main {
    //      Note: src/Main.java uses or overrides a deprecated API.
    //     * Note: Recompile with -Xlint:deprecation for details.
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Author author = new Author("Sandi", "Metz");

        author.addBook("Practical Object-Oriented Design in Ruby");
        author.addBook("99 Bottles of OOP");

        for (String book: author.getBooks()) {
            System.out.println(book);
        }
//        for (String book: author.publishedBooks()) {
//            System.out.println(book);
//        }
    }
}

//      Note: src/Main.java uses or overrides a deprecated API.
//     * Note: Recompile with -Xlint:deprecation for details.