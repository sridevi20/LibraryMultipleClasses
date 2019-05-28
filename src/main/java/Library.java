import java.util.ArrayList;

public class Library {
    private ArrayList<Books>books;
    private int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<Books>();
        this.capacity = capacity;
    }
    public int getCapacity(){
        return this.capacity;
    }
    public int booksCount(){
         return this.books.size();
    }
    public void  addBooks(Books books){
        this.books.add(books);

    }
    public void checkStockBook(Books books) {
        if (booksCount() < capacity) {
            this.books.add(books);
        }
    }
        public void removeBook(){
           this.books.remove(0);
        }
    }



