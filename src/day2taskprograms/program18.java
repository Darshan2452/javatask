package day2taskprograms;
import java.util.*;
public class program18 {

        int rollno;
        String name;
        int age;
        program18(int rollno,String name,int age){
            this.rollno=rollno;
            this.name=name;
            this.age=age;
        }
    }
class ArrayList5{
    public static void main(String args[]){
        //Creating user-defined class objects
        program18 s1=new program18(101,"Sonoo",23);
        program18 s2=new program18(102,"Ravi",21);
        program18 s3=new program18(103,"Hanumat",25);
        //creating arraylist
        ArrayList<program18> al=new ArrayList<program18>();
        al.add(s1);//adding Student class object
        al.add(s2);
        al.add(s3);
        //Getting Iterator
        Iterator itr=al.iterator();
        //traversing elements of ArrayList object
        while(itr.hasNext()){
            program18 st=(program18) itr.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
 class StringTrimExample{
    public static void main(String args[]){
        String s1="  hello string  shHHsHS ";
        System.out.println(s1+"javatpoint");//without trim()
        System.out.println(s1.trim()+"javatpoint");//with trim()
    }}

 class SplitExample2{
    public static void main(String args[]){
        String s1="welcome to split world";
        System.out.println("returning words:");
        for(String w:s1.split("\\s",0)){
            System.out.println(w);
        }
        System.out.println("returning words:");
        for(String w:s1.split("\\s",1)){
            System.out.println(w);
        }
        System.out.println("returning words:");
        for(String w:s1.split("\\S",4)){
            System.out.println(w);
        }

    }}
