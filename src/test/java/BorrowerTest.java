import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Library library;
    private Books books;
    private Borrower borrower;

@Before
public void setUp() {
    library = new Library(20);
    books = new Books("Happy Potter", "JK Rowling", "fantancy");
    borrower = new  Borrower();
 }
 @Test
    public void borrowBookCount(){
    assertEquals(0, borrower.borrowerBooksCount());

 }
 @Test
    public void addBorrowerBook(){
    borrower.addBorrower(books);
    assertEquals(1, borrower.borrowerBooksCount());

 }
 @Test
    public void removeBorrowerBook(){
    borrower.addBorrower(books);
    borrower.removeBorrower();
    assertEquals(0, borrower.borrowerBooksCount());
    }
    @Test
    public void takesBookFromLibrary(){
    library.addBooks(books);
    borrower.takesBookFromLibrary(library);
   assertEquals(1, library.booksCount() );
   assertEquals(0, borrower.borrowerBooksCount());
    }

}