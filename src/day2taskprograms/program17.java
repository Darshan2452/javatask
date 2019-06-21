package day2taskprograms;
import java.util.*;

public class program17 {
    int id;
    String name,author,publisher;
    int quantity;


    public program17(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
class book74 {
    public static void main(String[] args) {
        List<program17> map77 = new ArrayList<>();
        program17 c16 = new program17(10,"darshan","sa525bbda","jdsgjtetweds",3);
        program17 b17 = new program17(101,"d24234arshan","sa525bbda","jdswetwegjds",3);
        program17 b18 = new program17(102,"dsfdarshan","sabbd22a","jd2525sgjds",3);

        map77.add(c16);
        map77.add(b17);
        map77.add(b18);
        map77.add(b18);
        map77.add(b18);
        map77.add(b18);


        for(program17 b:map77){
            System.out.println("\t"+b);
        }
        Set<program17> ns=new HashSet<>(map77);
        System.out.println("\n");
        for(program17 b:ns){
            System.out.println("\t"+b);
        }
    }
}
