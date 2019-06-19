package Pack;

import java.util.Scanner;

import static java.lang.Thread.sleep;

class book
{
    Scanner s=new Scanner(System.in);

    String bookname,author,type;
    int price,n;

    void getDetails() throws InterruptedException {
        System.out.println("emter the number of books needs to add");
        n=s.nextInt();
        for(int i=0;i<n;i++){

            System.out.println("Enter the book name");
            bookname = s.nextLine();
            sleep(1000);
            System.out.println("\nEnter the auther name");
            author = s.nextLine();
            sleep(1000);
            System.out.println("\nEnter the book type");
            type = s.nextLine();
            sleep(1000);
            System.out.println("\nEnter the price");
            price = s.nextInt();

        }
    }

    void printDetails()
    {
        System.out.println("bookName "+bookname);
        System.out.println("author name "+author);
        System.out.println("type of the book " +type);
        System.out.println("price of the book " +price);


    }


    public static void main(String[] args) throws InterruptedException {
        book e=new book();
        e.getDetails();
        e.printDetails();

    }

}