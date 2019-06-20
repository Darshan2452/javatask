package day2taskprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;
import java.io.*;

public class program14 {
    int id;
    String name,author,publisher;
    int quantity;


    public void  program14(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
class book4{
    public static void main(String[] args){
        Map<Integer,program14> map=new HashMap<>();
        program14 c6=new program14();
        program14 b7=new program14();
        program14 b8=new program14();
        c6.id = 1001;
        c6.name = "darshan1";
        c6.author = "darshan1";
        c6.publisher = "enqu1ero";
        c6.quantity = 3;
        b7.id = 1002;
        b7.name = "arsh3an";
        b7.author = "darsrhan";
        b7.publisher = "engquero";
        b7.quantity = 5;
        b8.id = 1003;
        b8.name = "dsarshan";
        b8.author = "drarshan";
        b8.publisher = "etnquero";
        b8.quantity = 5;

        map.put(1,c6);
        map.put(2,b7);
        map.put(3,b8);
        Scanner s=new Scanner(System.in);
        System.out.println("enter book author");
        String title=s.nextLine();
        s.close();
        for(Map.Entry<Integer,program14> entry:map.entrySet()){
            program14 b=entry.getValue();
            if(title.equals(b.author))
            {
                System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
            }

        }


    }
}
