interface program3 {
     void add1(int a,int b);
    void sub(int a,int b);
}
abstract class demo implements program3{
    public  void add1(int a,int b){
        System.out.println(a+b);
    }
    public abstract void sub(int a,int b);
}

class fi extends  demo{
  //  public void add1(int a, int b) {
    //    System.out.println(a + b);
    //}

    public void sub(int a,int b){
        System.out.println(a-b);
    }
    public static void main(String[] args){
        fi t=new fi();
        t.add1(4,6);
        t.sub(10,7);
        demo t1=new fi();
        t1.add1(77,777);
        t1.sub(100,73);
        program3 t3=new fi();
        t3.add1(77,777);
        t3.sub(100,73);
       // program3 t2=new program3();
       // demo t4=new demo(); cannot be instantiated

        }
    }

