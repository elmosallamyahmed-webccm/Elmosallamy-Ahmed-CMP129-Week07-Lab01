import java.util.ArrayList;
public class Member {
    private String name;
    private int MEM_ID;
    private ArrayList<Book> borrowedBooks;
    public Member(String name, int MEM_ID) {
        this.name = name;
        this.MEM_ID = MEM_ID;
        borrowedBooks = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMEM_ID() {
        return MEM_ID;
    }
    public void setMEM_ID(int MEM_ID) {
        this.MEM_ID = MEM_ID;
    }
    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}
