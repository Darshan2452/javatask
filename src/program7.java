import java.util.Scanner;
class program7
{
    Scanner s=new Scanner(System.in);

    String name,gender;
    int age;
    static String company="Enquero";

    void getDetails()
    {
        System.out.println("Enter the name");
        name=s.nextLine();

        System.out.println("Enter the gender");
        gender=s.nextLine();

        System.out.println("Enter the age");
        age=s.nextInt();

    }


    void printDetails()
    {
        System.out.println("Name "+name);
        System.out.println("Gender "+gender);
        System.out.println("Age " +age);
        System.out.println("Company " +company);

    }


    public static void main(String[] args)
    {
        program7 e=new program7();
        e.getDetails();
        e.printDetails();

    }

}
