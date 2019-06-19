public class program4 {
    public static void main(String args[])
    {
        int count=1;
        String str="suszkskkcloowppzpaasllalx";
        String temp="";

        for(int i=0;i<str.length();i++)
        {
            int c=1;
            if(temp.contains(""+str.charAt(i))==false) {
                for (int j = i + 1; j < str.length(); j++)

                    if (str.charAt(j) == str.charAt(i))
                        c++;

                System.out.println("Occurence of " + str.charAt(i) + " =" + c);
                temp = temp + str.charAt(i);
            }
        }

    }

}
