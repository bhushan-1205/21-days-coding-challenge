import java.util.Arrays;
import java.util.Scanner;

public class KthLargestElement {
    public static int findKthLargest(int[] arr, int k) {
        Arrays.sort(arr); // Sorts the array in ascending order
        return arr[arr.length - k]; // Kth largest element
    }

    public static void main(String[] args) {
        int[] arr = {10, 14, 19, 26, 27, 31, 33, 35, 42, 44}; // Given array
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of K: ");
        int k = scanner.nextInt();
        
        if (k > 0 && k <= arr.length) {
            System.out.println("The " + k + "th largest element is: " + findKthLargest(arr, k));
        } else {
            System.out.println("Invalid K value. It should be between 1 and " + arr.length);
        }
        
        scanner.close();
    }
}
