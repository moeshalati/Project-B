class Book2{
    private String title;
    private String author;
    private int price;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void printInfo(){
        System.out.println("Book: Title =" + title + ", Author =" + author + ", Price =" + price);
    }
}

public class ex16 {
    public static void main(String[] args) {
        Book2 bookObj = new Book2();
        bookObj.setTitle("Title");
        bookObj.setAuthor("Author");
        bookObj.setPrice(10);
        bookObj.printInfo();
    }
}
