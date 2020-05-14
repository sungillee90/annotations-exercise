/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class Author extends Person {

    private List books;

    public Author(String firstName, String lastName) {
        super(firstName, lastName);
        books = new ArrayList();
    }

    /**
     * @deprecated Use publishedBooks instead
     * method does not override or implement a method from a supertype
     *     @Override
     *     ^
     * Note: src/Main.java uses or overrides a deprecated API.
     * Note: Recompile with -Xlint:deprecation for details.
     * Note: src/Author.java uses unchecked or unsafe operations.
     * Note: Recompile with -Xlint:unchecked for details.
     * 1 error
     */
    @Deprecated
    public List<String> getBooks() {
        return books;
    }
//    @SuppressWarnings("unchecked")
    public List<String> publishedBooks() {
        return books;
    }
//    @SuppressWarnings("unchecked")
    public void addBook(String book) {
        books.add(book);
    }

    // Solved by adding sortName() in the parent's class which is Person.
    @Override
    public String sortName() {
        return String.format("%s, %s", lastName, firstName);
    }
}
