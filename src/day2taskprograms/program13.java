package day2taskprograms;

import java.util.ArrayList;
import java.util.List;

public class program13 {
    int id;
    String name,author,publisher;
    int quantity;


    public void  program12(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
class book2 {
    public static void main(String[] args) throws Exception {
        List<program13> list1 = new ArrayList<program13>();

        program13 b4 = new program13();
        program13 b5=new program13();
        program13 b6=new program13();
        b4.id = 101;
        b4.name = "Dar";
        b4.author = "hello";
        b4.publisher = "india";
        b4.quantity = 3;
        list1.add(b4);
        b6.id = 107;
        b6.name = "Dar1shan";
        b6.author = "hell";
        b6.publisher = "indi";
        b6.quantity = 10;
        list1.add(b5);
        b5.id = 106;
        b5.name = "Dar1";
        b5.author = "hello1";
        b5.publisher = "india1";
        b5.quantity = 30;
        list1.add(b5);
        list1.set(0,b6);
        for(program13 b: list1){
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
