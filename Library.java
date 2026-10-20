import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;
    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void registerMember(Member member) {
        members.add(member);
    }
    public boolean borrowBook(Book book, int MEM_ID) {
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getMEM_ID() == MEM_ID && books.contains(book) && book.isAvailable()) {
                members.get(i).getBorrowedBooks().add(book);
                book.setAvailable(false);
                return true;
            }
        }
        return false;
    }
    public boolean returnBook(Book book, int MEM_ID) {
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getMEM_ID() == MEM_ID && members.get(i).getBorrowedBooks().contains(book)) {
                members.get(i).getBorrowedBooks().remove(book);
                book.setAvailable(true);
                return true;
            }
        }
        return false;
    }
}
