import java.util.Scanner;

public class ArrayOps {

    static void process(int[] arr) {
        // SORT HERE

        System.out.print("Numbers: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // SECOND HIGHEST/LOWEST HERE
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        process(arr);
        sc.close();
    }
}