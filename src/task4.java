public class task4 {
    public void task4(){
        System.out.println("constructor");
    }
    {
        System.out.println("instation ");
    }
    static{
        System.out.println("static");
    }

}
class d extends task4{
    public void d(){
        System.out.println("constructor");
    }
    {
        System.out.println("instation ");
    }
    static{
        System.out.println("static");
    }

}
class e{
    public static void main(String[] args){
        task4  t=new task4();
        task4 t1=new d();
        d t2=new d();
    }
}