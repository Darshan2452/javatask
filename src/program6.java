public class program6 {
    public static void main(String[] args)
    {
        int c=1;
        String str=" this is example for string token or delimeter using split method you can split";
        str=str.trim();

        for(int i=0;i<str.length();i++)
        {
            if((str.charAt(i)+"").equals(" "))
                c++;
        }

        System.out.println("No. of words are-"+c);

    }
}
