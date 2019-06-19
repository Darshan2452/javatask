public class program10 {

    void Program10(){
        System.out.println("Constructor of Parent");
    }
    void disp(){
        System.out.println("Parent Method");
    }
}
class new1 extends program10{
     new1(){
        System.out.println("Constructor of Child");
    }
    void disp(){
        System.out.println("Child Method");
        super.disp();
    }
    public static void main(String args[]){
        program10 obj = new new1();
        obj.disp();
    }
}

