package Pack;

public class task1 {
  public void display(int a,int b){
      System.out.println(a+b);
  }
  public void display(int a,float b){
      System.out.println(a+b);
  }
  public void display(int a,int...b){
      for(int i=0;i<b.length;i++) {
          System.out.print(b[i]);
      }
  }
}
 class overl extends task1{
    public static void main(String[] args) {
        task1 t = new task1();
        t.display(4, 5);
        t.display(4,5.5f);
        t.display(5,6,5,3,4,5,6);
    }
}
