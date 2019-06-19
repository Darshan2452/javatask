public class program1 {
   public void add(int a,int b)
    {
        System.out.println(a+b);
    }
}
class or extends program1{
    public void add(int a,int b) throws RuntimeException
    {
        System.out.println(a+b);
    }
    public static void main(String args[]){
        program1 o = new or();
        o.add(5,6);
    }
}