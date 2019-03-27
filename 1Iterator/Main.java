public class Main{
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);

        bookShelf.appendBook(new Book("AHJFHOI"));
        bookShelf.appendBook(new Book("DANFN-ffea")); 
        bookShelf.appendBook(new Book("BOJGIE"));
        bookShelf.appendBook(new Book("Choehieg"));
        bookShelf.appendBook(new Book("Choehieg"));
        bookShelf.appendBook(new Book("Choehieg"));
        
        Iterator it = bookShelf.iterator();
        while(it.hasNext()){
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
    
}
