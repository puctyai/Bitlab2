import java.util.Scanner;

public class Test21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {

            array[i] = scanner.nextInt();
        }

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < n; i++) {
            if (array[i] <array[minIndex]) {
                minIndex = i;
            }

            if (array[i] >array[maxIndex]) {
                maxIndex = i;
            }
        }

        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

