package day2taskprograms;

import java.util.*;

public class program16 {
    String id;
    String name;
    String author;
    String publisher;
    String quantity;

    public  program16(String id, String name, String author, String publisher, String quantity) {

            this.id = id;
            this.name = name;
            this.author = author;
            this.publisher = publisher;
            this.quantity = quantity;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public String getQuantity() {
            return quantity;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        public String toString() {
            return id + "" + name + "" + author + "" + publisher + "" + quantity;
        }
    }
    class book17 {
        public static void main(String[] args) throws Exception {
            List<program16> h5=List.of(new program16("1","d","s","s","1"),new program16("5","dhdhgr","shjrjd","shsr","3"),new program16("2","dhdhgf","shjdjd","shds","1"),new program16("1","d","s","s","1"),new program16("1","d","s","s","1"));
            Set<program16> a=new LinkedHashSet<program16>(h5);
            for (program16 b : a) {
                System.out.println(b);
            }

        }
    }
