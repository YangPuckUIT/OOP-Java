class Book {
    private String title;
    private int year;
    private String genre;
    private double price;
    private int sold;

    public Book(String title, int year, String genre, double price, int sold) {
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.price = price;
        this.sold = sold;
    }

    public double getRevenue() {
        return price * sold;
    }

    public String getGenre() { return genre; }
    public int getYear() { return year; }
}
class Author {
    private String name;
    private int age;
    private String address;

    private Book[] books; // mảng sách
    private int count;    // số sách hiện tại

    // Constructor
    public Author(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        books = new Book[100]; // tối đa 100 sách
        count = 0;
    }

    // Thêm sách
    public void addBook(Book b) {
        if (count < books.length) {
            books[count] = b;
            count++;
        } else {
            System.out.println("Book list is full!");
        }
    }

    // Tổng doanh thu
    public double totalRevenue() {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += books[i].getRevenue();
        }
        return sum;
    }

    // Doanh thu theo thể loại
    public double revenueByGenre(String genre) {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            if (books[i].getGenre().equalsIgnoreCase(genre)) {
                sum += books[i].getRevenue();
            }
        }
        return sum;
    }

    // Doanh thu theo năm
    public double revenueByYear(int year) {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            if (books[i].getYear() == year) {
                sum += books[i].getRevenue();
            }
        }
        return sum;
    }
}
public class Author_And_Book_Management {
    public static void main(String[] args) {

        Author author = new Author("Nguyen Van A", 40, "HCM");

        author.addBook(new Book("Book1", 2022, "IT", 100, 50));
        author.addBook(new Book("Book2", 2023, "Math", 150, 30));
        author.addBook(new Book("Book3", 2022, "IT", 200, 20));

        System.out.println("Total revenue: " + author.totalRevenue());

        System.out.println("Revenue (IT): " + author.revenueByGenre("IT"));

        System.out.println("Revenue (2022): " + author.revenueByYear(2022));
    }
}