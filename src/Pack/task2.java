package Pack;

import java.sql.SQLOutput;

public class task2 {


    public int add(int a, int b) {

        return (a + b);
    }
}

class Subtract extends task2 {
        public int add(int a, int b) {

            return (a-b);
        }
    }

    class Override {
        public static void main(String... ar) {
            Subtract ob = new Subtract();
            System.out.println(ob.add(5,2));
            task2 t=new task2();
            System.out.println(t.add(4,3));
            task2 t1=new Subtract();
            System.out.println(t1.add(4,2));
            task2 t2=new Subtract();
            System.out.println(t2.add(14,12));
        }
    }