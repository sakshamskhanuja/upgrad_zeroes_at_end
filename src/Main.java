import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        arr = moveZerosToEnd(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    // Method to find move all zeros to the end of the array
    static int[] moveZerosToEnd(int[] arr) {
        // Write your code here
        StringBuilder builder = new StringBuilder();
        for (int element : arr) {
            if (element != 0) {
                builder.append(element).append(" ");
            }
        }
        String[] numbers = builder.toString().split(" ");

        int[] zeroAtEnd = new int[arr.length];
        int numberOfZeroes = arr.length - numbers.length;

        for (int i = 0; i < arr.length; i++) {
            if (i >= (arr.length - numberOfZeroes)) {
                // Adding zeroes.
                zeroAtEnd[i] = 0;
            } else {
                zeroAtEnd[i] = Integer.parseInt(numbers[i]);
            }
        }
        return zeroAtEnd;
    }
}