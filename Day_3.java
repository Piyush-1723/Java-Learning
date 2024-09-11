import java.util.Scanner;

public class DuplicateFinder 
{
    public static int findDuplicate(int[] arr) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[i] == arr[j]) 
                {
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array : ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements (integers):");
        for (int i = 0; i < size; i++) 
        {
            arr[i] = scanner.nextInt();
        }

        int duplicate = findDuplicate(arr);
        if (duplicate != -1) 
        {
            System.out.println("Duplicate number: " + duplicate);
        } 
        else 
        {
            System.out.println("No duplicate found, though one is expected.");
        }

        scanner.close();
    }
}
