import java.util.ArrayList;

public class Borrower {
    private ArrayList<Books> borrower;

    public Borrower() {
        this.borrower = new  ArrayList<Books>();

    }
    public int  borrowerBooksCount(){
        return this.borrower.size();
    }
    public void addBorrower(Books books){
         this.borrower.add(books);

    }
    public void removeBorrower(){
        this.borrower.remove(0);
    }
    public void  takesBookFromLibrary(Library books){

        Books borrowerBook = Library.removeBook();
        this.borrower.add(borrowerBook);
    }
}
