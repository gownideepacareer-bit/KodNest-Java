import java.util.Scanner;

public class Practice12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();
        int even_sum = 0;
        int odd_sum = 0;

        while (start <= end) {

            if (start % 2 == 0) {
                even_sum += start;
            } else {
                odd_sum += 1;
            }

            start++;
        }

        System.out.println("Even sum: " + even_sum);
        System.out.println("Odd count: " + odd_sum);
        // Read the range and analyze its numbers

        sc.close();
    }
}
