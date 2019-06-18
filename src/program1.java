public class program1 {
    void add(int a,int b)
    {
        System.out.println(a+b);
    }
}
class or extends program1{
    void add(int a,int b) throws NullPointerException
    {
        System.out.println(a+b);
    }
    public static void main(String args[]){
        program1 o = new or();
        o.add(4,5);
    }
}