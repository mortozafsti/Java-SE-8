
package ChapterNine;

public class Book {
    int id;
    String name;
    String writer;
    String piblication;
    double price;

    public Book() {
    }

    public Book(int id, String name, String writer, String piblication,int price) {
        this.id = id;
        this.name = name;
        this.writer = writer;
        this.piblication = piblication;
        this.price = price;
    }
    
    public static void main(String[] args) {
        Book book = new Book(111, "Fifthy Shades Of Gray", "Lon Coffer", "Sun Publication",4500);
        System.out.println("ID: "+book.getId());
        System.out.println("Book Name: "+book.getName());
        System.out.println("Book Writer: "+book.getWriter());
        System.out.println("Publication: "+book.getPiblication());
        System.out.println("Book price: "+book.getPrice());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getWriter() {
        return writer;
    }

    public String getPiblication() {
        return piblication;
    }

    public double getPrice() {
        return price;
    }
    
    
}
