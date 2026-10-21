import java.util.ArrayList;
public class Library{
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();
    public void addBook(Book book) {
        books.add(book);
    }
    public void registerMember(Member member) {
        members.add(member);
    }
    public void borrowBook(Book book, int MEM_ID) {
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getMEM_ID() == MEM_ID && books.contains(book) && book.isAvailable()) {
                members.get(i).getBorrowedBooks().add(book);
                book.setAvailable(false);
                System.out.println("Book borrowed successfully.");
                return;
            }
        }
        System.out.println("Book could not be borrowed.");
    }
    public void returnBook(Book book, int MEM_ID) {
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getMEM_ID() == MEM_ID && members.get(i).getBorrowedBooks().contains(book)) {
                members.get(i).getBorrowedBooks().remove(book);
                book.setAvailable(true);
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Book could not be returned.");
    }
}
