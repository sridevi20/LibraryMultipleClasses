import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Books books;
    @Before
    public void setUp(){
        library = new Library(20);
        books = new Books("Harry Potter", "JK Rolling", "fantacy");
    }

    @Test
    public void hascapacity(){
        assertEquals(20, library.getCapacity());
    }
    @Test
    public void numberOfBooksCount(){
        assertEquals(0, library.booksCount());
    }
    @Test
    public void addBook(){
        library.addBooks(books);
        assertEquals(1, library.booksCount());
    }
    @Test
    public void checkStockBooks(){
        library.checkStockBook(books);
        assertEquals(1, library.booksCount());
    }
    @Test
    public void removeBookFromLibrary(){
        library.addBooks(books);
        library.removeBook();
        assertEquals(0, library.booksCount());
    }

}
