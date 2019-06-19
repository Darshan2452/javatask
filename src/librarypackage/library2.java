package librarypackage;

public class library2 extends library {
    private int bookNumber;
    private String bookName;
    private Double price;
    private int count;


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

