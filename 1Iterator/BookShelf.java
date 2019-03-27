import java.util.ArrayList;

public class BookShelf implements Aggregater{
    private ArrayList<Book> booklist;
    private int  last = 0;

    public BookShelf(int maxsize){
        this.booklist = new ArrayList<Book>();
    }

    public Book getBookAt(int index){
        return booklist.get(index);
    }

    public void appendBook (Book book){

        booklist.add(book);
        last++;
    }
    public int getLength(){
        return last;
    }
    public Iterator iterator(){
        return new BookShelfIterator(this);
    }
}