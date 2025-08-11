public class Patterns_Advanced 
{
    //HOLLOW RECTANGLE
    public static void hollow_rectangle(int totRow, int totCol)
    {
        //OUTER LOOP FOR ROWS
        for(int i=1; i<=totRow; i++)
        {
            //INNER LOOP FOR COLUMNS
            for(int j=1; j<=totCol; j++)
            {
                if(i==1 || j==1 || i==totRow || j==totCol)
                    System.out.print("*"+" ");
                else
                    System.err.print(" "+" ");
            }
            System.out.println();
        }
    }

    //INVERTED & ROTATED HALF-PYRAMID
    public static void inverted_rotated_half_pyramid(int n)
    {
        //OUTER LOOP FOR NUMBER OF LINES
        for(int i=1; i<=n; i++)
        {
            //SPACES
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" "+" ");
            }

            //STARS
            for(int j=1; j<=i; j++)
            {
                System.out.print("*"+" ");
            }

            System.out.println();
        }
    }

    //INVERTED HALF PYRAMID WITH NUMBERS
    public static void inverted_half_pyramid_with_numbers(int n)
    {
        //OUTER LOOP
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i+1; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }

    //FLOYD'S TRIANGLE
    public static void floyd_triangle(int n)
    {
        int a=1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.err.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }

    //0-1 TRIANGLE
    public static void zero_one_triangle(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                if((i+j)%2==0) //EVEN MATRIX PLACES HAVE 1 ELSE 0
                {
                    System.out.print("1"+" ");
                }
                else
                {
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }

    //BUTTERFLY PATTERN
    public static void butterfly_pattern_if_else(int n)
    {
        //1ST HALF (UPPER)
        //OUTER LOOP
        for(int i=1; i<=n; i++)
        {
            //INNER LOOP
            for(int j=1; j<=(2*n); j++)
            {
                if(j<=i || j>=((2*n)-i+1))
                {
                    System.out.print("*"+" ");
                }
                else
                {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }

        //2ND HALF (LOWER)
        for(int i=n; i>=1; i--)
        {
            for(int j=1; j<=(2*n); j++)
            {
                if(j<=i || j>=((2*n)-i+1))
                {
                    System.out.print("*"+" ");
                }
                else
                {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }


    //BUTTERFLY 2
    public static void butterfly_pattern(int n)
    {
        //1ST HALF (UPPER)
        //OUTER LOOP
        for(int i=1; i<=n; i++)
        {
            //INNER LOOP FOR 1ST STAR
            for(int j=1; j<=i; j++)
            {
                System.out.print("*"+" ");
            }
            //LOOP FOR SPACES
            for(int j=1; j<=2*(n-i); j++)
            {
                System.out.print(" "+" ");
            }
            //LOOP FOR LATER STARS
            for(int j=1; j<=i; j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        //2ND HALF (LOWER)
        for(int i=n; i>=1; i--)
        {
            //INNER LOOP
            for(int j=1; j<=i; j++)
            {
                System.out.print("*"+" ");
            }
            for(int j=1; j<=2*(n-i); j++)
            {
                System.out.print(" "+" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }


    //SOLID RHOMBUS
    public static void solid_rhombus(int n)
    {
        for(int i=0; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" "+" ");
            }
            for(int j=1; j<=n; j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }


    //HOLLOW RHOMBUS
    public static void hollow_rhombus(int n)
    {
        for(int i=0; i<=n; i++)
        {
            for(int j=1; j<=(n-i); j++)
            {
                System.out.print(" "+" ");
            }
            for(int j=1; j<=n; j++)
            {
                if(i==1 || j==1 || i==n || j==n)
                    System.out.print("*"+" ");
                else
                    System.err.print(" "+" ");
            }
            System.out.println();
        }
    }

    //DIAMOND PATTERN
    public static void diamond(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" "+" ");
            }
            for(int j=1; j<= (2*i)-1; j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" "+" ");
            }
            for(int j=1; j<= (2*i)-1; j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        // hollow_rectangle(4, 5);
        // System.out.println();
        // inverted_rotated_half_pyramid(5);
        // System.out.println();
        // inverted_half_pyramid_with_numbers(5);
        // System.out.println();
        // floyd_triangle(5);
        // System.out.println();
        // zero_one_triangle(5);
        // butterfly_pattern(5);
        // System.out.println();
        // butterfly_pattern_if_else(5);
        // solid_rhombus(5);
        // hollow_rhombus(5);
        diamond(4);
    }    
}
