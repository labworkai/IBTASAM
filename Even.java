import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int evenCount = 0;
        int oddCount = 0;
        int zeroCount = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter value #" + i + ": ");
            int value = scanner.nextInt();

            if (value % 2 == 0) {
                evenCount++;
            } else if (value % 2 != 0) {
                oddCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println("Count of even values: " + evenCount);
        System.out.println("Count of odd values: " + oddCount);
        System.out.println("Count of zero values: " + zeroCount);
    }
}
