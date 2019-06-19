public class program9 {
    public static void main(String[] args) {

        int n = 121, rev = 0, rem, on;

        on = n;

        while( n != 0 )
        {
            rem = n % 10;
            rev = rev * 10 + rem;
            n  /= 10;
        }

        if (on == rev)
            System.out.println(on + " is a palindrome.");
        else
            System.out.println(on + " is not a palindrome.");
    }
}
