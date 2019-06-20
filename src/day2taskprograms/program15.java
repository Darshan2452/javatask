package day2taskprograms;
import java.util.*;
import java.util.List;

class desec implements Comparator<program15>{

    @Override
    public int compare(program15 o1, program15 o2) {
        return Integer.compare(o2.id,o1.id);
    }
}

class program15 implements Comparable<program15>{
    int id;
    String name;
    String author;
    String publisher;
    int quantity;

    program15(int id, String name, String author, String publisher, int quantity) {

        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public String getPublisher(){
        return publisher;
    }
    public void setPublisher(String publisher){
        this.publisher=publisher;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public String toString(){
        return id+""+name+""+author+""+publisher+""+quantity;
    }

    @Override
    public int compareTo(program15 that) {
        return Integer.compare(this.id,that.id);
    }
}
class book77 {
    public static void main(String[] args) throws Exception {
        List<program15> h=List.of(new program15(1,"dhdhg","shjjd","shs",2),new program15(5,"dhdhgr","shjrjd","shsr",3),new program15(2,"dhdhgf","shjdjd","shds",1));
       ArrayList<program15> list = new ArrayList<>(h);
        Collections.sort(list);
        for (program15 b : list) {
           System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
        Collections.sort(list,new desec());
        for (program15 b : list) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }


    }
}
