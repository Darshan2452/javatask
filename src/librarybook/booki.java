package librarybook;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

 class Booki {
    public int BookId;
    public String BookName;
    public int price;
    public String IssuedDate;
    public Date ReturnDate;
    public double fine;

    public Booki(int BookId,String BookName,int price, String IssuedDate, Date ReturnDate){
        this.BookId=BookId;
        this.BookName=BookName;
        this.price=price;
        this.IssuedDate=IssuedDate;
        this.ReturnDate=ReturnDate;


    }

    public int getBookId() {
        return BookId;
    }

    public String getBookName() {
        return BookName;
    }

    public int getPrice() {
        return price;
    }

    public String getIssuedDate() {
        return IssuedDate;
    }

    public Date getReturnDate() {
        return ReturnDate;
    }


    public double fine(Date d)
    {
        long diff=d.getTime()- this.ReturnDate.getTime();
        long days= TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);
        if(days<10)
            fine=10;
        else if (days>10 && days<15)
            fine=10+(days-10)*2;
        else if (days>15 && days <30)
            fine=10+10+(days-15)*5;
        else
            fine=10+10+75+(days-30)*100;
        return fine;

    }

    public static void main (String args[]) throws Exception
    {
        Date d=new Date();


        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Book ID: ");
        int id = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Book name: ");
        String name = input2.nextLine();

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter Book Price: ");
        int price = input3.nextInt();

        Scanner input4 = new Scanner(System.in);
        System.out.println("Enter Issued Date: ");
        String Issued = input4.nextLine();

        Scanner input5 = new Scanner(System.in);
        System.out.println("Enter return date: ");
        String Returndate = input5.nextLine();

        Date d1 = new SimpleDateFormat("dd/mm/yyyy").parse(Returndate);

        Booki enq=new Booki(id,name,price,Issued,d1);

        System.out.println(enq.getBookId());
        System.out.println(enq.getBookName());
        System.out.println(enq.getPrice());
        System.out.println(enq.getIssuedDate());
        System.out.println(enq.getReturnDate());
        System.out.println(enq.fine(d));






    }
}
