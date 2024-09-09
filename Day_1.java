import java.util.Scanner;

public class SortArray 
{
    public static void sort(int[] ar) 
    {
        int l = 0;
        int m = 0;
        int h = ar.length - 1;

        while (m <= h) 
        {
            if (ar[m] == 0) 
            {
                swap(ar, l, m);
                l++;
                m++;
            } else if (ar[m] == 1) 
            {
                m++;
            } 
            else 
            { 
                swap(ar, m, h);
                h--;
            }
        }
    }

    private static void swap(int[] ar, int i, int j) 
    {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array elements separated by spaces (0s, 1s, and 2s only):");
        String inputStr = scanner.nextLine();
        String[] inputArr = inputStr.split("\\s+");
        
        int[] ar = new int[inputArr.length];
        boolean validInput = true;

        for (int i = 0; i < inputArr.length; i++) 
        {
            try 
            {
                int num = Integer.parseInt(inputArr[i]);
                if (num >= 0 && num <= 2) 
                {
                    ar[i] = num;
                } else 
                {
                    validInput = false;
                    break;
                }
            } 
            catch (NumberFormatException e) 
            {
                validInput = false;
                break;
            }
        }

        if (!validInput) {
            System.out.println("Error: The array must contain only 0s, 1s, and 2s.");
            scanner.close();
            return;
        }

        sort(ar);
        
        System.out.print("Sorted array: ");
        for (int num : ar) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
