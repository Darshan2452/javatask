public class task3 {
    public void print() {
        System.out.println("class a");
    }
}
    class b extends task3 {
        public void print() {
            System.out.println("class b");
        }
    }
class c{
        public static void main(String[] args){
            task3 t=new task3();
            t.print();
            task3 t1=new b();
            t1.print();
            b t3=new b();
            t.print();
           // b t4=new task3();
            t1.print();
        }
}

