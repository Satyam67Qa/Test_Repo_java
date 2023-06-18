package Satyam_pattern;

public class P7 {
    public static void main(String[] args) {
        // a unicode =98
//        a           a
//        ab          bb
//        abc         ccc
//        abcd        dddd
//        abcde        eeeee
        for (char i ='a';i<='e';i++)
        {
            for (char j='a';j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println( );
        }
    }
}
