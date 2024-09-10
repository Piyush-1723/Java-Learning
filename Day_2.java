import java.util.Scanner;

public class MissingNumberFinder 
{
    public static int findMissingNumber(int[] arr) 
    {
        int n = arr.length + 1; 
        int expectedSum = n * (n + 1) / 2; 
        int actualSum = 0;
        
        for (int num : arr) 
        {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array (n-1): ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter the " + size + " elements of the array:");
        
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int missingNumber = findMissingNumber(arr);
        System.out.println("Missing number: " + missingNumber);
        scanner.close();
    }
}
