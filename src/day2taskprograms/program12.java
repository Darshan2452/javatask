package day2taskprograms;
import java.util.*;

class program12 {
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
    class book1 {
        public static void main(String[] args) throws Exception {
            List<program12> list = new ArrayList<program12>();
            program12 b1 = new program12();
            program12 b2 = new program12();
            program12 b3 = new program12();
            b1.id = 101;
            b1.name = "darshan";
            b1.author = "darshan";
            b1.publisher = "enquero";
            b1.quantity = 4;
            b2.id = 102;
            b2.name = "darshan";
            b2.author = "darshan";
            b2.publisher = "enquero";
            b2.quantity = 4;
            b3.id = 103;
            b3.name = "darshan";
            b3.author = "darshan";
            b3.publisher = "enquero";
            b3.quantity = 4;
            list.add(b1);
            list.add(b2);
            list.add(b3);
            b3.id = 104;
            b3.name = "darshan";
            b3.author = "darshan";
            b3.publisher = "enquero";
            b3.quantity = 4;
            for (program12 b : list) {
                System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
            }

        }
    }