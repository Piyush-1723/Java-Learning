
import java.util.*;
public class Patterns 
{   //Outer Loop for Horizontal Lines
    //Inner Loop for number of times
    //What to print
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n=4;
        //SQUARE PATTERN
        for(int line=1; line<=n; line++)
        {
            for(int star=1; star<=n; star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        //RIGHT-ANGLE TRIANGLE
        for(int line=1; line<=n; line++)
        {
            for(int star=1; star<=line; star++) // Change 4-> line
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        //INVERTTED RIGHT-ANGLE TRIANGLE
        for(int line=1; line<=n; line++)
        {
            for(int star=1; star<=n-line+1; star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        //HALF PYRAMID (NUMBER BASED)
        for(int line=1; line<=n; line++)
        {
            for(int num=1; num<=line; num++)
            {
                System.out.print(num+" ");
            }
            System.out.println();
        }
        System.out.println();

        //CHARACTER PYRAMID 
        char ch= 'A';
        for(int line=1; line<=n; line++)
        {
            for(int chr =1; chr<=line; chr++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
        System.out.println();

        
        sc.close();
    }
}
