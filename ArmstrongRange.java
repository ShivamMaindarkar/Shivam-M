import java.util.Scanner;

public class ArmstrongRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the start of range: ");
        int start = sc.nextInt();

        System.out.print("Enter the end of range: ");
        int end = sc.nextInt();

        printArmstrongNumber(start, end);
    }

    public static void printArmstrongNumber(int start, int end) {
        for (int num = start; num <= end; num++) {
            int original = num;
            int sum = 0;

            while (original > 0) {
                int digit = original % 10;

                // Calculate cube of digit using loop
                int cube = 1;
                for (int i = 0; i < 3; i++) {
                    cube *= digit;
                }

                sum += cube;
                original /= 10;
            }

            if (sum == num) {
                System.out.println(num + " is an Armstrong number");
            }
        }
    }
}
